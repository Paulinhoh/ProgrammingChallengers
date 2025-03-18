package edu.paulinho.challengers;

public class ContadorOvelhas {

    public int contarOvelhas(Boolean[] arrayOvelhas) {
        int contador = 0;

        for (Boolean present : arrayOvelhas) {
            if (present != null && present) {
                contador++;
            }
        }

        return contador;
    }
}
