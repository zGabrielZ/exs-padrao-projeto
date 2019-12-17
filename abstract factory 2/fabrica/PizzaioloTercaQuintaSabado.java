package fabrica;

import produto.Pizza;
import produto.PizzaPresunto;

public class PizzaioloTercaQuintaSabado extends PizzariaAbstrata {

	@Override
	public Pizza criarPizza() {
		return new PizzaPresunto();
	}

}
