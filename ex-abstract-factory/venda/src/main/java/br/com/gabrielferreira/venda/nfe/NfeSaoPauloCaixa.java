package br.com.gabrielferreira.venda.nfe;

import br.com.gabrielferreira.venda.boleta.Boleta;
import br.com.gabrielferreira.venda.boleta.impl.BoletaCaixaImpl;
import br.com.gabrielferreira.venda.notafiscal.NotaFiscal;
import br.com.gabrielferreira.venda.notafiscal.impl.NotaFiscalSaoPauloImpl;

public class NfeSaoPauloCaixa implements ModuloGerarNfeFactory {

    @Override
    public NotaFiscal criarNotaFiscal() {
        return new NotaFiscalSaoPauloImpl();
    }

    @Override
    public Boleta criarBoleto() {
        return new BoletaCaixaImpl();
    }
}
