package br.com.gabrielferreira.log.calculadoraimposto.impl;

import br.com.gabrielferreira.log.calculadoraimposto.CalculadoraImposto;
import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;

class CalculadoraImpostoArquivoTxtImplTest {

    private static final String CAMINHO_COMPLETO = System.getProperty("user.home") + "/Downloads/";
    private static final Logger log = LoggerFactory.getLogger(CalculadoraImpostoArquivoTxtImplTest.class);

    private CalculadoraImposto calculadoraImposto;

    @BeforeEach
    void setUp() {
        calculadoraImposto = new CalculadoraImpostoArquivoTxtImpl(CAMINHO_COMPLETO);
    }

    @Test
    @DisplayName("Deve calcular imposto com o log logger")
    void deveCalcularImpostoComLogConsole() {
        calculadoraImposto.calcular(BigDecimal.valueOf(100.00));
        Assertions.assertEquals(BigDecimal.valueOf(90.00).setScale(2, RoundingMode.HALF_EVEN),
                calculadoraImposto.getValorCalculadoAposImposto().setScale(2, RoundingMode.HALF_EVEN));
    }

    @AfterAll
    static void afterAll() {
        File file = new File(CAMINHO_COMPLETO + "log.txt");
        boolean delete = file.delete();
        log.info("Arquivo deletado: {}", delete);
    }
}
