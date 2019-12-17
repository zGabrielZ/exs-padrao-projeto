package factory;

import produto.NomeSobrenome;
import produto.Pessoa;
import produto.SobrenomeNome;

public class NomeFactory {

	public static Pessoa gerarNome(String msg,String nome,String sobrenome) {
		if(msg.equalsIgnoreCase("Nome Sobrenome")) {
			return new NomeSobrenome(nome, sobrenome);
		}
		else {
			return new SobrenomeNome(nome, sobrenome);
		}
	}
}
