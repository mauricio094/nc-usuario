package com.nucounts.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@EqualsAndHashCode
public class Usuario {

    private String email;
    private String nome;
    private String senha;
    private BigDecimal conta;
}
