package br.com.gabrielferreira.dao.impl;

import br.com.gabrielferreira.dao.AgendaDAO;
import br.com.gabrielferreira.exception.MsgException;
import br.com.gabrielferreira.model.Contato;
import org.junit.jupiter.api.*;

import java.io.File;
import java.util.UUID;

class AgendaDAOImplTest {

    private static final String CAMINHO_COMPLETO = System.getProperty("user.home") + "/Downloads/".concat("agenda.txt");
    private AgendaDAO agendaDAO;

    @BeforeEach
    void setUp() {
        agendaDAO = new AgendaDAOImpl();
    }

    @Test
    @DisplayName("Deve cadastrar contato")
    void deveCadastrarContato() {
        Contato contato = new Contato(null, "José da Silva", "9999-9999");
        agendaDAO.inserir(contato);

        Contato contatoEncontrado = agendaDAO.buscar(contato.getCodigo());
        Assertions.assertNotNull(contatoEncontrado);
        Assertions.assertEquals(contato.getNome(), contatoEncontrado.getNome());
        Assertions.assertEquals(contato.getTelefone(), contatoEncontrado.getTelefone());
    }

    @Test
    @DisplayName("Não deve buscar contato por código")
    void naoDeveBuscarContatoPorCodigo() {
        Contato contato = new Contato(null, "Mariana da silva", "9999-9999");
        agendaDAO.inserir(contato);

        UUID codigo = UUID.fromString("123e4567-e89b-12d3-a456-426614174000");
        MsgException msgException = Assertions.assertThrows(MsgException.class, () -> agendaDAO.buscar(codigo));
        Assertions.assertEquals("Contato não encontrado", msgException.getMessage());
    }

    @AfterAll
    static void afterAll() {
        File file = new File(CAMINHO_COMPLETO);
        file.delete();
    }
}
