package br.com.gabrielferreira.colecao.util;

import java.util.Scanner;

public class Processor {

    private static final Scanner scanner = new Scanner(System.in);

    private Processor() {}

    public static String input() {
        return scanner.nextLine();
    }

    public static void close() {
        scanner.close();
    }
}
