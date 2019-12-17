package produto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Arquivo implements ImpressoraAbstrato{

	@Override
	public void imprmir() {
		String caminho = "C:\\Users\\ferre\\OneDrive\\Documentos\\Faculdade\\HelloWorld.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminho,true))) {
				bw.write("Hello, World");
				bw.flush();
				bw.close();	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
