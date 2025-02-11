package br.com.gabrielferreira.venda.nfe;

import br.com.gabrielferreira.venda.boleta.Boleta;
import br.com.gabrielferreira.venda.boleta.impl.BoletaBancoDoBrasil;
import br.com.gabrielferreira.venda.notafiscal.NotaFiscal;
import br.com.gabrielferreira.venda.notafiscal.impl.NotaFiscalRioDeJaneiroImpl;

public class NfeRioDeJaneiroBancoDoBrasil implements ModuloGerarNfeFactory {

    @Override
    public NotaFiscal criarNotaFiscal() {
        return new NotaFiscalRioDeJaneiroImpl();
    }

    @Override
    public Boleta criarBoleto() {
        return new BoletaBancoDoBrasil();
    }
}
