package br.com.gabrielferreira.pagamento.payment;

import java.math.BigDecimal;

public class PayPal implements Pagamento {

    @Override
    public BigDecimal pagar() {
        return BigDecimal.valueOf(100.00);
    }
}
