package br.com.gabrielferreira.email.enviaremail.impl;

import br.com.gabrielferreira.email.enviaremail.EnviadorEmail;

import java.util.List;

public class EnviadorEmailImpl implements EnviadorEmail {

    private final List<String> emails;

    public EnviadorEmailImpl(List<String> emails) {
        this.emails = emails;
    }

    @Override
    public void enviar(String mensagem) {
        if (emails != null) {
            emails.forEach(email -> {
                System.out.println("Enviando a mensagem " + mensagem + " para o e-mail " + email);
                System.out.println("Enviando email......");
                System.out.println("Enviado");
            });
        }
    }

    public List<String> getEmails() {
        return emails;
    }
}
