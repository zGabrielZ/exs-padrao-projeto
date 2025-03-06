package br.com.gabrielferreira.contador.exception;

import java.io.Serial;

public class MsgException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = -3463594657256491279L;

    public MsgException(String mensagem) {
        super(mensagem);
    }
}
