package br.com.gabrielferreira.factory;

import br.com.gabrielferreira.exception.MsgException;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;

public class ContadorArquivoFactory implements ContadorFactory {

    @Override
    public void gerarContador(Integer inicio, Integer fim) {
        String saidaArquivo = System.getProperty("user.home") + "/Downloads/contador.txt";
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(saidaArquivo, StandardCharsets.UTF_8))){
            for (int i = inicio; i <= fim; i++) {
                bufferedWriter.write("Número: " + i);
                bufferedWriter.newLine();
            }
            System.out.println("Arquivo gerado na saída : " + saidaArquivo);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao gerar arquivo : " + e.getMessage());
            throw new MsgException("Ocorreu um erro ao gerar arquivo");
        }
    }
}
