package br.com.gabrielferreira.pagamento.payment;

import java.math.BigDecimal;

public class Payoneer implements Pagamento {

    @Override
    public BigDecimal pagar() {
        return BigDecimal.valueOf(300.00);
    }
}
