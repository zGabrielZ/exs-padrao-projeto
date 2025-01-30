package br.com.gabrielferreira.log.calculadoraimposto;

import org.junit.jupiter.api.*;

import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;

class CalculadoraImpostoArquivoTxtTest {

    private static final String CAMINHO_COMPLETO = System.getProperty("user.home") + "/Downloads/";

    private CalculadoraImposto calculadoraImposto;

    @BeforeEach
    void setUp() {
        calculadoraImposto = new CalculadoraImpostoArquivoTxt(CAMINHO_COMPLETO);
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
        file.delete();
    }
}
