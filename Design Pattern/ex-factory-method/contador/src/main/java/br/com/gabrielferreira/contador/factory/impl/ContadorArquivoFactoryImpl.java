package br.com.gabrielferreira.contador.factory.impl;

import br.com.gabrielferreira.contador.factory.ContadorFactory;
import br.com.gabrielferreira.contador.exception.MsgException;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;

import static br.com.gabrielferreira.contador.util.LoggerUtil.error;
import static br.com.gabrielferreira.contador.util.LoggerUtil.info;

public class ContadorArquivoFactoryImpl implements ContadorFactory {

    @Override
    public void gerarContador(Integer inicio, Integer fim) {
        String saidaArquivo = System.getProperty("user.home") + "/Downloads/contador.txt";
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(saidaArquivo, StandardCharsets.UTF_8))){
            for (int i = inicio; i <= fim; i++) {
                bufferedWriter.write("Número: " + i);
                bufferedWriter.newLine();
            }
            info("Arquivo gerado na saída : " + saidaArquivo);
        } catch (Exception e) {
            error("Ocorreu um erro ao gerar arquivo : " + e.getMessage());
            throw new MsgException("Ocorreu um erro ao gerar arquivo");
        }
    }
}
