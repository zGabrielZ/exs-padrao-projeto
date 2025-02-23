package br.com.gabrielferreira.enviaremail.impl;

import br.com.gabrielferreira.email.enviaremail.impl.EnviadorEmailImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class EnviadorEmailImplTest {

    private EnviadorEmailImpl enviadorEmail;

    @BeforeEach
    void setUp() {
        enviadorEmail = new EnviadorEmailImpl(Arrays.asList("marcos@email.com", "joao@email.com"));
    }

    @Test
    @DisplayName("Dado uma mensagem quando ao enviar e-mail então deve verificar quantidade de emails")
    void deveVerificarQuantidadeEmail() {
        enviadorEmail.enviar("Bem vindo ao curso de HTML5 e CSS3");
        Assertions.assertEquals(2, enviadorEmail.getEmails().size());
    }

    @Test
    @DisplayName("Dado uma mensagem quando ao enviar e-mail então deve obter emails")
    void deveObterEmails() {
        enviadorEmail.enviar("Bem vindo ao curso de HTML5 e CSS3");
        Assertions.assertEquals("marcos@email.com", enviadorEmail.getEmails().get(0));
        Assertions.assertEquals("joao@email.com", enviadorEmail.getEmails().get(1));
    }
}
