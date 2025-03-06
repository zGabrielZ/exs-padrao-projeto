package br.com.gabrielferreira.pedido.exception;

import java.io.Serial;

public class PedidoXMLException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 2329603800782045102L;

    public PedidoXMLException(String msg) {
        super(msg);
    }
}
