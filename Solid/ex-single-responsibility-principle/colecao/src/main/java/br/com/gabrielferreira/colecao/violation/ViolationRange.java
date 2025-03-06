package br.com.gabrielferreira.colecao.violation;

public class ViolationRange {

    private static final Integer MIN = 0;
    private static final Integer MAX = 10;

    private ViolationRange() {}

    public static boolean isValid(Integer valor) {
        return valor >= MIN && valor <= MAX;
    }
}
