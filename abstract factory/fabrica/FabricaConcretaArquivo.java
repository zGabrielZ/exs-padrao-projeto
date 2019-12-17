package fabrica;

import produto.Arquivo;
import produto.ImpressoraAbstrato;

public class FabricaConcretaArquivo extends LojaAbstrata {

	@Override
	public ImpressoraAbstrato criarImpressora() {
		return new Arquivo();
	}

}
