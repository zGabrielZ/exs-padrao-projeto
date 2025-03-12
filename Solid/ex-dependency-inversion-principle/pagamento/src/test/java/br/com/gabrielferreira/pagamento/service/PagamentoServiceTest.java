package br.com.gabrielferreira.pagamento.service;

import br.com.gabrielferreira.pagamento.payment.PayPal;
import br.com.gabrielferreira.pagamento.payment.Payoneer;
import br.com.gabrielferreira.pagamento.payment.Skrill;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PagamentoServiceTest {

    private PagamentoService pagamentoService;

    @Test
    @DisplayName("Deve gerar pagamento paypal")
    void deveGerarPagamentoPayPal() {
        pagamentoService = new PagamentoService(new PayPal());

        assertEquals(BigDecimal.valueOf(100.00), pagamentoService.pagar());
    }

    @Test
    @DisplayName("Deve gerar pagamento payoneer")
    void deveGerarPagamentoPayoneer() {
        pagamentoService = new PagamentoService(new Payoneer());

        assertEquals(BigDecimal.valueOf(300.00), pagamentoService.pagar());
    }

    @Test
    @DisplayName("Deve gerar pagamento skrill")
    void deveGerarPagamentoSkrill() {
        pagamentoService = new PagamentoService(new Skrill());

        assertEquals(BigDecimal.valueOf(200.00), pagamentoService.pagar());
    }

}