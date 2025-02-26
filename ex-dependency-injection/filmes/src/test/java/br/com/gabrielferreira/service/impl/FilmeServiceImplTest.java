package br.com.gabrielferreira.service.impl;

import br.com.gabrielferreira.filmes.exception.MsgException;
import br.com.gabrielferreira.filmes.model.Filme;
import br.com.gabrielferreira.filmes.model.enums.TipoFilme;
import br.com.gabrielferreira.filmes.repository.impl.FilmeRepositoryImpl;
import br.com.gabrielferreira.filmes.service.FilmeService;
import br.com.gabrielferreira.filmes.service.impl.FilmeServiceImpl;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.time.Clock;
import java.time.LocalDate;
import java.time.ZoneId;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class FilmeServiceImplTest {

    private static final String CAMINHO_COMPLETO = System.getProperty("user.home") + "/Downloads/".concat("filmes.txt");
    private static final Logger log = LoggerFactory.getLogger(FilmeServiceImplTest.class);

    private FilmeService filmeService;

    private Filme filme;

    private Clock clock;

    @BeforeEach
    void setUp() {
        clock = mock(Clock.class);
        filmeService = new FilmeServiceImpl(new FilmeRepositoryImpl(), clock);
    }

    @Test
    @DisplayName("Deve salvar um filme novo")
    void deveSalvarFilmeNovo() {
        filme = new Filme("Matrix", LocalDate.of(1999, 3, 31), null);

        LocalDate dataFixa = LocalDate.of(1999,4,8);
        when(clock.instant()).thenReturn(dataFixa.atStartOfDay(ZoneId.systemDefault()).toInstant());
        when(clock.getZone()).thenReturn(ZoneId.systemDefault());

        Filme filmeSalvo = filmeService.salvar(filme);

        assertEquals(filme.getTitulo(), filmeSalvo.getTitulo());
        assertEquals(filme.getDataLancamento(), filmeSalvo.getDataLancamento());
        assertEquals(TipoFilme.NOVO, filmeSalvo.getTipoFilme());
    }

    @Test
    @DisplayName("Deve salvar um filme antigo")
    void deveSalvarFilmeAntigo() {
        filme = new Filme("Matrix", LocalDate.of(1999, 3, 31), null);

        LocalDate dataFixa = LocalDate.of(2023,8,8);
        when(clock.instant()).thenReturn(dataFixa.atStartOfDay(ZoneId.systemDefault()).toInstant());
        when(clock.getZone()).thenReturn(ZoneId.systemDefault());

        Filme filmeSalvo = filmeService.salvar(filme);

        assertEquals(filme.getTitulo(), filmeSalvo.getTitulo());
        assertEquals(filme.getDataLancamento(), filmeSalvo.getDataLancamento());
        assertEquals(TipoFilme.ANTIGO, filmeSalvo.getTipoFilme());
    }

    @Test
    @DisplayName("Deve lançar exceção ao salvar um filme nulo")
    void deveLancarExcecaoAoSalvarFilmeNulo() {
        filme = null;

        MsgException msgException = assertThrows(MsgException.class, () -> filmeService.salvar(filme));
        assertEquals("Filme não pode ser nulo", msgException.getMessage());
    }

    @Test
    @DisplayName("Deve lançar exceção ao salvar um filme sem título")
    void deveLancarExcecaoAoSalvarFilmeSemTitulo() {
        filme = new Filme(null, LocalDate.of(1999, 3, 31), null);

        MsgException msgException = assertThrows(MsgException.class, () -> filmeService.salvar(filme));
        assertEquals("Título do filme não pode ser nulo ou vazio", msgException.getMessage());
    }

    @Test
    @DisplayName("Deve lançar exceção ao salvar um filme sem data de lançamento")
    void deveLancarExcecaoAoSalvarFilmeSemDataLancamento() {
        filme = new Filme("Matrix", null, null);

        MsgException msgException = assertThrows(MsgException.class, () -> filmeService.salvar(filme));
        assertEquals("Data de lançamento do filme não pode ser nula", msgException.getMessage());
    }

    @AfterAll
    static void afterAll() {
        File file = new File(CAMINHO_COMPLETO);
        boolean delete = file.delete();
        log.info("Arquivo deletado: {}", delete);
    }
}
