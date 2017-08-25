package com.ncusuario.gateways.http.resources;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.isNull;


@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class ListUsuariosResource<T> {
    @Valid
    @NotEmpty(message = "{validation.field.notnull}")
    private List<T> usuarios;

    public List<T> getSkus() {
        if (isNull(usuarios)) {
            usuarios = new ArrayList<>();
        }
        return usuarios;
    }
}
