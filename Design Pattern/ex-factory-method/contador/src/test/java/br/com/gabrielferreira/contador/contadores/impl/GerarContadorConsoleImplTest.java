package br.com.gabrielferreira.contador.contadores.impl;

import br.com.gabrielferreira.contador.contadores.GerarContador;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GerarContadorConsoleImplTest {

    private GerarContador gerarContador;

    @BeforeEach
    void setUp() {
        gerarContador = new GerarContadorConsoleImpl();
    }

    @Test
    @DisplayName("Deve gerar contador de 1 até 10")
    void deveGerarContador() {
        gerarContador.gerarContador(1, 10);
    }
}
