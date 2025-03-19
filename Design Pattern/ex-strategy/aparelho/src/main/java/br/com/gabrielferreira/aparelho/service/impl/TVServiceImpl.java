package br.com.gabrielferreira.aparelho.service.impl;

import br.com.gabrielferreira.aparelho.model.Produto;
import br.com.gabrielferreira.aparelho.service.AparelhoService;

import java.math.BigDecimal;

public class TVServiceImpl implements AparelhoService {

    @Override
    public Produto criarProduto() {
        return new Produto("TV Smart Ultra HD 65", "Esta televisão é muito boa", BigDecimal.valueOf(3500.00));
    }
}
