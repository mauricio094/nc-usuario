package com.ncusuario.domains;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@ToString(exclude = {"lastModifiedDate"})
@Document(collection = "users")
@TypeAlias("Usuario")
@EqualsAndHashCode(of = "email")
public class Usuario implements Serializable {

    @Getter
    @Setter
    @Id
    private String email;
    @Getter
    @Setter
    private String nome;
    @Getter
    @Setter
    private String senha;
    @Getter
    @LastModifiedDate
    private LocalDateTime lastModifiedDate;
}
