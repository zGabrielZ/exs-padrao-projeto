package br.com.gabrielferreira.nome.nomes.impl;

import br.com.gabrielferreira.nome.nomes.GerarNomeCompleto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GerarNomeSobrenomeImplTest {

    private GerarNomeCompleto gerarNomeCompleto;

    @BeforeEach
    void setUp() {
        gerarNomeCompleto = new GerarNomeSobrenomeImpl();
    }

    @Test
    @DisplayName("Deve gerar nome completo")
    void deveGerarNomeCompleto() {
        String nomeCompleto = gerarNomeCompleto.gerarNomeCompleto("Gabriel", "Ferreira");
        Assertions.assertEquals("Gabriel Ferreira", nomeCompleto);
    }
}
