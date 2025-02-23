package br.com.gabrielferreira.email.proxy.impl;

import br.com.gabrielferreira.email.proxy.EnviadorEmail;

import java.util.List;

import static br.com.gabrielferreira.email.util.LoggerUtil.info;

public class EnviadorEmailImpl implements EnviadorEmail {

    private final List<String> emails;

    public EnviadorEmailImpl(List<String> emails) {
        this.emails = emails;
    }

    @Override
    public void enviar(String mensagem) {
        if (emails != null) {
            emails.forEach(email -> {
                info("Enviando a mensagem " + mensagem + " para o e-mail " + email);
                info("Enviando email......");
                info("Enviado");
            });
        }
    }

    public List<String> getEmails() {
        return emails;
    }
}
