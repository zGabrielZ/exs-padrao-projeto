package fabrica;

import produto.NaoTemPizza;
import produto.Pizza;

public class PizzariaFechada extends PizzariaAbstrata {

	@Override
	public Pizza criarPizza() {
		return new NaoTemPizza();
	}

}
