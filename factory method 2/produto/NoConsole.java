package produto;

public class NoConsole implements Contador {

	@Override
	public void contarAteDez() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
	}

}
