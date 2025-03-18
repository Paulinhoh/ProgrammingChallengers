package edu.paulinho.challengers;

import java.util.Arrays;
import java.util.Collections;

public class OrdemDecrescente {

    public static int ordenarDesc(int num) {

        String[] array = String.valueOf(num).split("");
        Arrays.sort(array, Collections.reverseOrder());

        return Integer.parseInt(String.join("", array));
    }
}
