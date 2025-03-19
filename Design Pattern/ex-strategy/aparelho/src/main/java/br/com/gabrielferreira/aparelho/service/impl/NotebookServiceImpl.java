package br.com.gabrielferreira.aparelho.service.impl;

import br.com.gabrielferreira.aparelho.model.Produto;
import br.com.gabrielferreira.aparelho.service.AparelhoService;

import java.math.BigDecimal;

public class NotebookServiceImpl implements AparelhoService {

    @Override
    public Produto criarProduto() {
        return new Produto("Acer aspire 3", "Este notebook é muito bom", BigDecimal.valueOf(2500.00));
    }
}
