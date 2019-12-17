package produto;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class NoArquivo implements Contador {

	@Override
	public void contarAteDez() {
		String caminho = "C:\\Users\\ferre\\OneDrive\\Documentos\\Faculdade\\contador.txt";
		
		try(PrintWriter bw = new PrintWriter(new FileWriter(caminho,true))) {
			for(int i=1;i<=10;i++) {
				bw.printf("%d \n",i);
			}
				bw.flush();
				bw.close();	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
