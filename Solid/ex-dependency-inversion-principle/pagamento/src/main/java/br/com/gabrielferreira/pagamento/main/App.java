package br.com.gabrielferreira.pagamento.main;

import br.com.gabrielferreira.pagamento.payment.PayPal;
import br.com.gabrielferreira.pagamento.payment.Payoneer;
import br.com.gabrielferreira.pagamento.payment.Skrill;
import br.com.gabrielferreira.pagamento.service.PagamentoService;

public class App {

    public static void main(String[] args) {
        PagamentoService pagamentoService = new PagamentoService(new PayPal());
        System.out.println(pagamentoService.pagar());

        pagamentoService = new PagamentoService(new Skrill());
        System.out.println(pagamentoService.pagar());

        pagamentoService = new PagamentoService(new Payoneer());
        System.out.println(pagamentoService.pagar());
    }
}
