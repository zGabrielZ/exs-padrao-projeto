package br.com.gabrielferreira.esportes.main;

import br.com.gabrielferreira.esportes.template.Basquete;
import br.com.gabrielferreira.esportes.template.Futebol;

public class App {

    public static void main(String[] args) {
        Futebol futebol = new Futebol("Palmeiras", "Corinthians", 2, 1);
        futebol.executar();

        Basquete basquete = new Basquete("Flamengo", "Vasco", 100, 90);
        basquete.executar();
    }
}
