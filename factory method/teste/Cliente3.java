package teste;

import java.util.Scanner;

import factory.NomeFactory;

public class Cliente3 {

	public static void main(String[] args) {
		System.out.println("Qual formato do seu nome voce quer ? ");
		
		System.out.println("Nome Sobrenome ou Sobrenome, Nome ?? ");
		
		Scanner sc = new Scanner(System.in);
		
		String msg = sc.nextLine();
		
		System.out.println("Informe seu nome");
		
		String nome = sc.nextLine();
		

		System.out.println("Informe seu sobrenome");
		
		String sobrenome = sc.nextLine();
		
		
		NomeFactory.gerarNome(msg, nome, sobrenome);
		
		sc.close();
	}

}
