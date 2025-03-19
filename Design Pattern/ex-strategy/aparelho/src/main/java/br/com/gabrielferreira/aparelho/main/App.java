package br.com.gabrielferreira.aparelho.main;

import br.com.gabrielferreira.aparelho.service.ProdutoService;
import br.com.gabrielferreira.aparelho.service.impl.CelularServiceImpl;
import br.com.gabrielferreira.aparelho.service.impl.NotebookServiceImpl;
import br.com.gabrielferreira.aparelho.service.impl.ProdutoServiceImpl;
import br.com.gabrielferreira.aparelho.service.impl.TVServiceImpl;

public class App {

    public static void main(String[] args) {
        ProdutoService produtoService = new ProdutoServiceImpl(new TVServiceImpl());
        System.out.println(produtoService.criar());

        produtoService = new ProdutoServiceImpl(new CelularServiceImpl());
        System.out.println(produtoService.criar());

        produtoService = new ProdutoServiceImpl(new NotebookServiceImpl());
        System.out.println(produtoService.criar());
    }
}
