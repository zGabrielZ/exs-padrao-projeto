package br.com.gabrielferreira.enviaremail.impl;

import br.com.gabrielferreira.email.enviaremail.impl.EnviadorEmailProxyImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EnviadorEmailProxyImplTest {

    private EnviadorEmailProxyImpl enviadorEmail;

    @BeforeEach
    void setUp() {
        enviadorEmail = new EnviadorEmailProxyImpl("contatos1.xml", "contatos2.xml");
    }

    @Test
    @DisplayName("Dado uma mensagem quando ao enviar e-mail então deve verificar quantidade de emails que não esteja na blacklist")
    void deveVerificarQuantidadeEmail() {
        enviadorEmail.enviar("Bem vindo ao curso de HTML5 e CSS3");
        Assertions.assertEquals(3, enviadorEmail.getEmailsNotBlackList().size());
    }

    @Test
    @DisplayName("Dado uma mensagem quando ao enviar e-mail então deve obter emails que não esteja na blacklist")
    void deveObterEmails() {
        enviadorEmail.enviar("Bem vindo ao curso de HTML5 e CSS3");
        Assertions.assertEquals("mariana@email.com", enviadorEmail.getEmailsNotBlackList().get(0));
        Assertions.assertEquals("lucas@email.com", enviadorEmail.getEmailsNotBlackList().get(1));
        Assertions.assertEquals("ronaldo@email.com", enviadorEmail.getEmailsNotBlackList().get(2));
    }
}
