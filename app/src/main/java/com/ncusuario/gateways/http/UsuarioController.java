package com.ncusuario.gateways.http;

import com.ncusuario.gateways.http.resources.request.UsuarioRequest;
import com.ncusuario.usecases.FindUsuario;
import com.ncusuario.usecases.SaveUsuario;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Slf4j
@RestController
@RequestMapping("api/v1")
@AllArgsConstructor
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

}
