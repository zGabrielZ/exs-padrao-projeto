package br.com.gabrielferreira.colecao.util;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ProcessorTest {

    @Test
    @DisplayName("Deve retornar a entrada do usuário")
    @Order(1)
    void deveRetornarEntradaDoUsuario() {
        String entrada = "Seja bem vindo";
        System.setIn(new java.io.ByteArrayInputStream(entrada.getBytes()));

        String resultado = Processor.input();

        Assertions.assertEquals(entrada, resultado);
    }

    @Test
    @DisplayName("Deve fechar o scanner")
    @Order(2)
    void deveFecharScanner() {
        Processor.close();
        Assertions.assertThrows(IllegalStateException.class, Processor::input);
    }
}
