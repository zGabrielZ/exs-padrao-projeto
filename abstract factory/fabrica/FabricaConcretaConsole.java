package fabrica;

import produto.Console;
import produto.ImpressoraAbstrato;

public class FabricaConcretaConsole extends LojaAbstrata {

	@Override
	public ImpressoraAbstrato criarImpressora() {
		return new Console();
	}

}
