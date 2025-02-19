package br.com.gabrielferreira.email.main;

import br.com.gabrielferreira.email.enviaremail.EnviadorEmail;
import br.com.gabrielferreira.email.enviaremail.impl.EnviadorEmailImpl;
import br.com.gabrielferreira.email.enviaremail.impl.EnviadorEmailProxyImpl;

import java.util.Arrays;

public class EnviarEmail {

    public static void main(String[] args) {
        EnviadorEmail enviadorEmail = new EnviadorEmailImpl(Arrays.asList("gabriel@email.com", "jose@email.com", "marcos@email.com"));
        enviadorEmail.enviar("Bem vindo ao curso de Java 21");

        System.out.println("--------------------------------------------------------------------------------------------------------");

        enviadorEmail = new EnviadorEmailProxyImpl("contatos1.xml", "contatos2.xml");
        enviadorEmail.enviar("Bem vindo ao curso de Java 21");
    }
}
