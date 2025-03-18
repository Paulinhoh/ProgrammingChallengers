package edu.paulinho.challengers;

public class MinMax {

    public int min(int[] list) {
        int min = list[0];

        for (int i : list) {
            if (i < min) {
                min = i;
            }
        }

        return min;
    }

    public int max(int[] list) {
        int max = list[0];

        for (int i : list) {
            if (i > max) {
                max = i;
            }
        }

        return max;
    }
}
