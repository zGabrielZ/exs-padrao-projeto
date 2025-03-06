package br.com.gabrielferreira.venda.boleta;

import br.com.gabrielferreira.venda.produto.Produto;

public interface Boleta {

    String emitirBoletoBancario(Produto produto);
}
