package fabrica;

import produto.ImpressoraAbstrato;

public abstract class LojaAbstrata {

	public abstract ImpressoraAbstrato criarImpressora();
	
	public static LojaAbstrata criarLojaConcreta(Integer msg) {
		if(msg == 1) {
			return new FabricaConcretaConsole();
		}
		else if(msg == 2) {
			return new FabricaConcretaArquivo();
		}
		
		return null;
	}
}
