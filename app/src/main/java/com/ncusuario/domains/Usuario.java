package com.ncusuario.domains;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
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

}
