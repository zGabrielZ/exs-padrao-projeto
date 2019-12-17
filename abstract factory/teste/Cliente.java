package teste;

import java.util.Scanner;

import fabrica.LojaAbstrata;

public class Cliente {

	public static void main(String[] args) {
		
		System.out.println("Qual Hello World que vc quer que imprima?");
		System.out.println("[1] No console ");
		System.out.println("[2] No Arquivo ");
		
		Scanner sc = new Scanner(System.in);
		
		Integer escolher = sc.nextInt();
		
		switch (escolher) {
		case 1:
			LojaAbstrata.criarLojaConcreta(escolher).criarImpressora().imprmir();
			break;
		case 2:
			LojaAbstrata.criarLojaConcreta(escolher).criarImpressora().imprmir();
		default:
			break;
		}
		sc.close();
	}
}
