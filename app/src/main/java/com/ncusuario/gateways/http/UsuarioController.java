package com.ncusuario.gateways.http;

import com.ncusuario.gateways.http.resources.request.UsuarioRequest;
import com.ncusuario.gateways.http.resources.response.UsuarioResponse;
import com.ncusuario.usecases.FindUsuario;
import com.ncusuario.usecases.SaveUsuario;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static java.util.Optional.ofNullable;


@Slf4j
@RestController
@RequestMapping("api/v1")
public class UsuarioController {

    private FindUsuario findUsuario;
    private SaveUsuario saveUsuario;

    @RequestMapping(
            value = "/user",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity.BodyBuilder saveUser(@RequestBody @Valid final UsuarioRequest usuarioRequest) {
        saveUsuario.execute(usuarioRequest.toDomain());
        return ResponseEntity.ok();
    }

    @RequestMapping(value = "/user{email}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UsuarioResponse> getUsuarioByEmail(@PathVariable final String email) {
        return ofNullable(this.findUsuario.execute(email)).map(usuario -> ResponseEntity.ok(new UsuarioResponse(usuario)))
                .orElse(ResponseEntity.notFound().build());
    }

}
