package produto;

public class PizzaPresunto implements Pizza{

	@Override
	public void pizzaPronta() {
		System.out.println("Pizza contém queijo, presunto e tomate");
	}

}
