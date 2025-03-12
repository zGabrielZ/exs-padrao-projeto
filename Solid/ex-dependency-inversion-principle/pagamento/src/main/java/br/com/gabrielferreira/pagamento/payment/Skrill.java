package br.com.gabrielferreira.pagamento.payment;

import java.math.BigDecimal;

public class Skrill implements Pagamento {

    @Override
    public BigDecimal pagar() {
        return BigDecimal.valueOf(200.00);
    }
}
