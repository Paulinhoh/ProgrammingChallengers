package edu.paulinho.challengers;

public class Troll {

    // primeira forma de resolver
    public static String removerVogais(String msg) {
        return msg.replaceAll("[aeiouAEIOU]", "");
    }

    // segunda forma de resolver
    public static String removerVogais2(String msg) {
        return msg.replaceAll("(?i)[aeiou]", "");
    }
}
