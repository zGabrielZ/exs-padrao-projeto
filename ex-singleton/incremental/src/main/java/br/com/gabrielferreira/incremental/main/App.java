package br.com.gabrielferreira.incremental.main;

import br.com.gabrielferreira.incremental.util.IncrementalUtil;

public class App {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(new IncrementalUtil().getInstance().getNumero());
        }
    }
}
