package br.com.gabrielferreira.log.exception;

import java.io.Serial;

public class MsgException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = -628003098481669813L;

    public MsgException(String mensagem) {
        super(mensagem);
    }
}
