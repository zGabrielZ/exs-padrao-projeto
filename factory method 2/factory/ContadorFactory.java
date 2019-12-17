package factory;

import produto.Contador;
import produto.NoArquivo;
import produto.NoConsole;

public class ContadorFactory {

	public static Contador gerarContador(String msg) {
		if(msg.equalsIgnoreCase("No console")) {
			return new NoConsole();
		}
		else {
			return new NoArquivo();
		}
	}
}
