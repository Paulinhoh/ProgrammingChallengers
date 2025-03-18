package edu.paulinho.challengers;

public class InverterPalavras {

    public String inverterPlavras(String msg) {
        String[] palavras = msg.split(" ");

        for (int i = 0; i < palavras.length; i++) {
            if (palavras[i].length() > 5) {
                palavras[i] = new StringBuilder(palavras[i]).reverse().toString();
            }
        }

        return String.join(" ", palavras);
    }
}
