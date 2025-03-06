package br.com.gabrielferreira.contador.contadores.impl;

import br.com.gabrielferreira.contador.contadores.GerarContador;
import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

class GerarContadorArquivoImplTest {

    private static final String CAMINHO_COMPLETO = System.getProperty("user.home") + "/Downloads/contador.txt";
    private static final Logger log = LoggerFactory.getLogger(GerarContadorArquivoImplTest.class);

    private GerarContador gerarContador;

    @BeforeEach
    void setUp() {
        gerarContador = new GerarContadorArquivoImpl();
    }

    @Test
    @DisplayName("Deve gerar contador de 1 até 10")
    void deveGerarContador() {
        gerarContador.gerarContador(1, 10);
        Assertions.assertTrue(new File(CAMINHO_COMPLETO).exists());
    }

    @AfterAll
    static void afterAll() {
        File file = new File(CAMINHO_COMPLETO);
        boolean delete = file.delete();
        log.info("Arquivo deletado: {}", delete);
    }
}
