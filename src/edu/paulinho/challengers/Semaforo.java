package edu.paulinho.challengers;

public class Semaforo {

    public static String atualizarSemaforo(String atual) {
        return switch (atual) {
            case "verde" -> "amarelo";
            case "amarelo" -> "vermelho";
            case "vermelho" -> "verde";
            default -> throw new IllegalArgumentException("Cor inválida");
        };
    }
}
