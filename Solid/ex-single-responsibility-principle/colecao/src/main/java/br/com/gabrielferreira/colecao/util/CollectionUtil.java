package br.com.gabrielferreira.colecao.util;

import java.util.List;

public class CollectionUtil {

    private CollectionUtil() {}

    public static List<Integer> order(List<Integer> list) {
        list.sort(Integer::compareTo);
        return list;
    }
}
