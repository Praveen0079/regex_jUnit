package com.bridgelabz.regex;

public class replaceSpaces {
    public static void main(String[] args) {
        String statement = "This    is an     example     with  multiple       spaces.";
        String regex = "\\s+";

        String replaced = statement.replaceAll(regex," ");
        System.out.println(replaced);
    }
}
