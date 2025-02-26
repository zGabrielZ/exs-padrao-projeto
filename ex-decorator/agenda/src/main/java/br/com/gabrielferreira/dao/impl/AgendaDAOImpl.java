package br.com.gabrielferreira.dao.impl;

import br.com.gabrielferreira.dao.AgendaDAO;
import br.com.gabrielferreira.exception.MsgException;
import br.com.gabrielferreira.model.Contato;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class AgendaDAOImpl implements AgendaDAO {

    private static final Logger logger = LoggerFactory.getLogger(AgendaDAOImpl.class);
    private static final String CAMINHO_COMPLETO = System.getProperty("user.home") + "/Downloads/".concat("agenda.txt");

    @Override
    public void inserir(Contato contato) {
        contato.setCodigo(UUID.randomUUID());
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(CAMINHO_COMPLETO, StandardCharsets.UTF_8, true))){
            String texto = contato.getCodigo() + "," +
                    contato.getNome() + "," +
                    contato.getTelefone();

            bufferedWriter.write(texto);
            bufferedWriter.newLine();
            logger.info("Contato salvo com sucesso !!!");
        } catch (Exception e) {
            logger.error("Ocorreu um erro ao salvar o contato no arquivo: {}", e.getMessage());
            throw new MsgException("Ocorreu um erro ao salvar o contato");
        }
    }

    @Override
    public Contato buscar(UUID codigo) {
        List<Contato> contatos = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(CAMINHO_COMPLETO, StandardCharsets.UTF_8))){
            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                String[] dados = linha.split(",");
                for (int i = 0; i < dados.length; i++) {
                    contatos.add(new Contato(UUID.fromString(dados[0]), dados[1], dados[2]));
                }
            }
        } catch (Exception e) {
            logger.error("Ocorreu um erro ao buscar o contato no arquivo: {}", e.getMessage());
            throw new MsgException("Ocorreu um erro ao buscar o contato");
        }

        return contatos.stream()
                .filter(contato -> contato.getCodigo().equals(codigo))
                .findFirst()
                .orElseThrow(() -> new MsgException("Contato não encontrado"));
    }
}
