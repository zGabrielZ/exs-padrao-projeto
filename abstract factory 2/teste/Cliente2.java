package teste;

import java.util.Scanner;

import fabrica.PizzariaAbstrata;

public class Cliente2 {

	public static void main(String[] args) {
		System.out.println("Informe o nome do dia da semana para saber o sabor da pizza");
		
		System.out.println("Segunda,Terça,Quarta,Quinta,Sexta,Sábado,Domingo");
		
		Scanner sc = new Scanner(System.in);
		
		String msg = sc.nextLine();
		
		PizzariaAbstrata.avisarPizzaiolo(msg).criarPizza().pizzaPronta();
		
		sc.close();
	}
}
