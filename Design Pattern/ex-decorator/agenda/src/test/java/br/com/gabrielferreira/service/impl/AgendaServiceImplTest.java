package br.com.gabrielferreira.service.impl;

import br.com.gabrielferreira.dao.impl.AgendaDAOImpl;
import br.com.gabrielferreira.dao.impl.CacheAgendaDAOImpl;
import br.com.gabrielferreira.model.Contato;
import br.com.gabrielferreira.service.AgendaService;
import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.UUID;

class AgendaServiceImplTest {

    private static final String CAMINHO_COMPLETO = System.getProperty("user.home") + "/Downloads/".concat("agenda.txt");
    private static final Logger log = LoggerFactory.getLogger(AgendaServiceImplTest.class);
    private AgendaService agendaService;

    @BeforeEach
    void setUp() {
        agendaService = new AgendaServiceImpl(new CacheAgendaDAOImpl(new AgendaDAOImpl()));
    }

    @Test
    @DisplayName("Deve cadastrar contato")
    void deveCadastrarContato() {
        Contato contato = new Contato(null, "José da Silva", "9999-9999");
        agendaService.inserir(contato);

        Contato contatoEncontrado = agendaService.buscar(contato.getCodigo());
        Assertions.assertNotNull(contatoEncontrado);
        Assertions.assertEquals(contato.getNome(), contatoEncontrado.getNome());
        Assertions.assertEquals(contato.getTelefone(), contatoEncontrado.getTelefone());
    }

    @Test
    @DisplayName("Não deve buscar contato por código")
    void naoDeveBuscarContatoPorCodigo() {
        Assertions.assertNull(agendaService.buscar(UUID.fromString("123e4567-e89b-12d3-a456-426614174000")));
    }

    @AfterAll
    static void afterAll() {
        File file = new File(CAMINHO_COMPLETO);
        boolean delete = file.delete();
        log.info("Arquivo deletado: {}", delete);
    }

}
