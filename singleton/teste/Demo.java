package teste;

import singleton.Incremental;

public class Demo {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {    
			Incremental inc = new Incremental();  
			System.out.println(inc.getInstance());
		}  
	}
}
