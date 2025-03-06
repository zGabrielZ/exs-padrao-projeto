package br.com.gabrielferreira.colecao.violation;

public class ViolationChecker {

    private ViolationChecker() {}

    public static boolean isValid(String valor) {
        try {
            Integer.parseInt(valor);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}
