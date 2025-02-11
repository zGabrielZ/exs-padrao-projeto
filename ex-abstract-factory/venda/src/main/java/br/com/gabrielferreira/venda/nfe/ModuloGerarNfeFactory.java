package br.com.gabrielferreira.venda.nfe;

import br.com.gabrielferreira.venda.boleta.Boleta;
import br.com.gabrielferreira.venda.notafiscal.NotaFiscal;

public interface ModuloGerarNfeFactory {

    NotaFiscal criarNotaFiscal();

    Boleta criarBoleto();
}
