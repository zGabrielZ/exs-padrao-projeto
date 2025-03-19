package br.com.gabrielferreira.aparelho.service.impl;

import br.com.gabrielferreira.aparelho.model.Produto;
import br.com.gabrielferreira.aparelho.service.AparelhoService;
import br.com.gabrielferreira.aparelho.service.ProdutoService;

public class ProdutoServiceImpl implements ProdutoService {

    private final AparelhoService aparelhoService;

    public ProdutoServiceImpl(AparelhoService aparelhoService) {
        this.aparelhoService = aparelhoService;
    }

    @Override
    public Produto criar() {
        return aparelhoService.criarProduto();
    }
}
