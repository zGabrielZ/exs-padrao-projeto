package br.com.gabrielferreira.venda.notafiscal;

import br.com.gabrielferreira.venda.produto.Produto;

public interface NotaFiscal {

    void calcularImposto(Produto produto);
}
