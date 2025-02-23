package br.com.gabrielferreira.email.model;

import java.io.Serializable;

public record Contato(
        String nome,
        String email,
        boolean blackList
) implements Serializable {
}
