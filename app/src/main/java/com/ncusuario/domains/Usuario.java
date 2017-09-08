package com.ncusuario.domains;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDate;

@ToString(exclude = {"lastModifiedDate"})
@Document(collection = "NuCount-Usuarios")
@TypeAlias("NuCount-Usuarios")
public class Usuario implements Serializable {

    @Id
    @Getter
    @Setter
    private String email;
    @Getter
    @Setter
    private String nome;
    @Getter
    @Setter
    private String senha;
    @Getter
    @LastModifiedDate
    private LocalDate lastModifiedDate;

}
