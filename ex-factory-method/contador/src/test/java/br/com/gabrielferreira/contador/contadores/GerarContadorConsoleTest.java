package br.com.gabrielferreira.contador.contadores;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GerarContadorConsoleTest {

    private GerarContador gerarContador;

    @BeforeEach
    void setUp() {
        gerarContador = new GerarContadorConsole();
    }

    @Test
    @DisplayName("Deve gerar contador de 1 até 10")
    void deveGerarContador() {
        gerarContador.gerarContador(1, 10);
    }
}
