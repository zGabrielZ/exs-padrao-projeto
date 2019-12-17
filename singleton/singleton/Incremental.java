package singleton;

public class Incremental {

	private Incremental instanciaIncremental;
	
	private static int count = 0;   
	private int numero; 
	
	public Incremental getInstance() {   
		if(instanciaIncremental == null) {
			instanciaIncremental = new Incremental();
			instanciaIncremental.numero = ++count;
		}
		else {
			System.out.println("Já foi instanciado");
		}
		return instanciaIncremental;
	}   
	public String toString() {  
		return "Incremental " + numero;
	} 
}
