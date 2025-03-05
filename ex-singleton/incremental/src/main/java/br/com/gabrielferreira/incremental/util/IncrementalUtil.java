package br.com.gabrielferreira.incremental.util;

public class IncrementalUtil {

    private IncrementalUtil incrementalUtil;

    private static int count = 0;
    private int numero;

    public IncrementalUtil getInstance() {
        if (incrementalUtil == null) {
            incrementalUtil = new IncrementalUtil();
            incrementalUtil.numero = ++count;
        } else {
            return incrementalUtil;
        }
        return incrementalUtil;
    }

    public int getNumero() {
        return numero;
    }
}
