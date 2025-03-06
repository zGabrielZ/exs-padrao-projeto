package br.com.gabrielferreira.filmes.repository.impl;

import br.com.gabrielferreira.filmes.exception.MsgException;
import br.com.gabrielferreira.filmes.model.Filme;
import br.com.gabrielferreira.filmes.repository.FilmeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;

public class FilmeRepositoryImpl implements FilmeRepository {

    private static final Logger logger = LoggerFactory.getLogger(FilmeRepositoryImpl.class);
    private static final String CAMINHO_COMPLETO = System.getProperty("user.home") + "/Downloads/".concat("filmes.txt");

    @Override
    public Filme salvar(Filme filme) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(CAMINHO_COMPLETO, StandardCharsets.UTF_8, true))){
            String stringBuilder = "Título: " + filme.getTitulo() + "\n" +
                    "Ano: " + filme.getDataLancamento() + "\n" +
                    "Tipo: " + filme.getTipoFilme().getDescricao() + "\n";
            bufferedWriter.write(stringBuilder);
            bufferedWriter.newLine();
            logger.info("Filme salvo com sucesso, arquivo gerado em: {}", CAMINHO_COMPLETO);
        } catch (Exception e) {
            logger.error("Ocorreu um erro ao salvar o filme no arquivo: {}", e.getMessage());
            throw new MsgException("Ocorreu um erro ao salvar o filme");
        }
        return filme;
    }
}
