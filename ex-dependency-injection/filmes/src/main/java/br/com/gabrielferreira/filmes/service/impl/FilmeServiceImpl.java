package br.com.gabrielferreira.filmes.service.impl;

import br.com.gabrielferreira.filmes.exception.MsgException;
import br.com.gabrielferreira.filmes.model.Filme;
import br.com.gabrielferreira.filmes.model.enums.TipoFilme;
import br.com.gabrielferreira.filmes.repository.FilmeRepository;
import br.com.gabrielferreira.filmes.service.FilmeService;

import java.time.Clock;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class FilmeServiceImpl implements FilmeService {

    private final FilmeRepository filmeRepository;
    private final Clock clock;

    public FilmeServiceImpl(FilmeRepository filmeRepository, Clock clock) {
        this.filmeRepository = filmeRepository;
        this.clock = clock;
    }

    @Override
    public Filme salvar(Filme filme) {
        validarFilme(filme);

        LocalDate dataAtual = getDataAtual();
        if (ChronoUnit.MONTHS.between(filme.getDataLancamento(), dataAtual) > 3) {
            filme.setTipoFilme(TipoFilme.ANTIGO);
        } else {
            filme.setTipoFilme(TipoFilme.NOVO);
        }

        return filmeRepository.salvar(filme);
    }

    private void validarFilme(Filme filme) {
        if (Objects.isNull(filme)) {
            throw new MsgException("Filme não pode ser nulo");
        }

        if (Objects.isNull(filme.getTitulo()) || filme.getTitulo().isEmpty()) {
            throw new MsgException("Título do filme não pode ser nulo ou vazio");
        }

        if (Objects.isNull(filme.getDataLancamento())) {
            throw new MsgException("Data de lançamento do filme não pode ser nula");
        }
    }

    private LocalDate getDataAtual() {
        return LocalDate.now(clock);
    }
}
