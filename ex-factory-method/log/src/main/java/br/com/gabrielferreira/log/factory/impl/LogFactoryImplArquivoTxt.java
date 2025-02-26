package br.com.gabrielferreira.log.factory.impl;

import br.com.gabrielferreira.log.exception.MsgException;
import br.com.gabrielferreira.log.factory.LogFactory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;

public class LogFactoryImplArquivoTxt implements LogFactory {

    private final String saida;

    public LogFactoryImplArquivoTxt(String saida) {
        this.saida = saida;
    }

    @Override
    public void log(String mensagem) {
        String nomeArquivo = saida.concat("log.txt");
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(nomeArquivo, StandardCharsets.UTF_8))){
            bufferedWriter.write(mensagem);
            new LogFactoryImplLogger().log("Arquivo gerado com sucesso, arquivo gerado: " + nomeArquivo);
        } catch (Exception e) {
            new LogFactoryImplLogger().log("Ocorreu um erro ao gerar o arquivo: " + e.getMessage());
            throw new MsgException("Ocorreu um erro ao gerar arquivo");
        }
    }
}
