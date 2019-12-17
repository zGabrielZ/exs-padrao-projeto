package fabrica;

import produto.Pizza;

public abstract class PizzariaAbstrata {

	public abstract Pizza criarPizza();
	
	public static PizzariaAbstrata avisarPizzaiolo(String msg) {
		
		if(msg.equalsIgnoreCase("Segunda") || msg.equalsIgnoreCase("Quarta") || msg.equalsIgnoreCase("Sexta")) {
				return new PizzaioloSegundaQuartaSexta();
			}
		else if(msg.equalsIgnoreCase("Terça") || msg.equalsIgnoreCase("Quinta") || msg.equalsIgnoreCase("Sabádo")) {
				return new PizzaioloTercaQuintaSabado();
			}
		else {
				return new PizzariaFechada();
			}
	
	}
}
