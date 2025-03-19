package br.com.gabrielferreira.aparelho.service.impl;

import br.com.gabrielferreira.aparelho.model.Produto;
import br.com.gabrielferreira.aparelho.service.AparelhoService;

import java.math.BigDecimal;

public class CelularServiceImpl implements AparelhoService {

    @Override
    public Produto criarProduto() {
        return new Produto("Iphone 15", "Este celular é muito bom", BigDecimal.valueOf(5500.00));
    }
}
