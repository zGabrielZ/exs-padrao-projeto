package br.com.gabrielferreira.factory;

import br.com.gabrielferreira.exception.MsgException;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;

public class LogFactoryArquivoTxt implements LogFactory {

    private final String saida;

    public LogFactoryArquivoTxt(String saida) {
        this.saida = saida;
    }

    @Override
    public void log(String mensagem) {
        String nomeArquivo = saida.concat("log.txt");
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(nomeArquivo, StandardCharsets.UTF_8))){
            bufferedWriter.write(mensagem);
            new LogFactoryLogger().log("Arquivo gerado com sucesso !!!");
        } catch (Exception e) {
            new LogFactoryLogger().log("Ocorreu um erro ao gerar o arquivo: " + e.getMessage());
            throw new MsgException("Ocorreu um erro ao gerar arquivo");
        }
    }
}
