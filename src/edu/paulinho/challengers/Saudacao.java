package edu.paulinho.challengers;

public class Saudacao {

    public static String saudacao(String nome, String dono) {

        return nome.equals(dono) ? "Olá chefe " : "Olá convidado";
    }
}
