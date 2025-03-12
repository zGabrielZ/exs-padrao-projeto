package br.com.gabrielferreira.pagamento.service;

import br.com.gabrielferreira.pagamento.payment.Pagamento;

import java.math.BigDecimal;

public class PagamentoService {

    private final Pagamento pagamento;

    public PagamentoService(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public BigDecimal pagar() {
        return pagamento.pagar();
    }
}
