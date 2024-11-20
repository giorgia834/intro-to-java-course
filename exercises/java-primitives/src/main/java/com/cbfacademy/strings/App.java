package com.cbfacademy.strings;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
    }

    public static String concatenate(String word1, String word2, String word3) {
        return word1 + word2 + word3;
    }

    public static Boolean areEqual(String word1, String word2) {
        return word1 == word2;
    }

    public static String format(String item, int quantity, double price) {
        // TODO: Write code to return a string formatted as follows: "Item: [item]. Price: £[price]. Quantity: [quantity]". The price should be formatted to two decimal places, e.g. 99.99
        throw new RuntimeException("Not implemented");
    }
}
