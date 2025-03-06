package br.com.gabrielferreira.email.exception;

import java.io.Serial;

public class ContatoXMLException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 7611031993158930423L;

    public ContatoXMLException(String mensagem) {
        super(mensagem);
    }
}
