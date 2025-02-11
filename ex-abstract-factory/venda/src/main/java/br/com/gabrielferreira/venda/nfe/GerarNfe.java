package br.com.gabrielferreira.venda.nfe;

import br.com.gabrielferreira.venda.boleta.Boleta;
import br.com.gabrielferreira.venda.notafiscal.NotaFiscal;
import br.com.gabrielferreira.venda.produto.Produto;

public class GerarNfe {

    private final NotaFiscal notaFiscal;

    private final Boleta boleta;

    public GerarNfe(ModuloGerarNfeFactory moduloGerarNfeFactory) {
        this.notaFiscal = moduloGerarNfeFactory.criarNotaFiscal();
        this.boleta = moduloGerarNfeFactory.criarBoleto();
    }

    public String gerarVenda(Produto produto) {
        this.notaFiscal.calcularImposto(produto);
        return this.boleta.emitirBoletoBancario(produto);
    }
}
