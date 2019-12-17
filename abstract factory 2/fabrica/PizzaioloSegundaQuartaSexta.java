package fabrica;

import produto.Pizza;
import produto.PizzaCalabresa;

public class PizzaioloSegundaQuartaSexta extends PizzariaAbstrata {

	@Override
	public Pizza criarPizza() {
		return new PizzaCalabresa();
	}

}
