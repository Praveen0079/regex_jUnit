package com.bridgelabz.regex;

public class CensorWords {
    public static void main(String[] args) {
        String statement = "This is a damn bad example with some stupid words.";
        String[] str = {"damn","stupid"};

        for( String i : str){
//            String regex = i;
            statement = statement.replaceAll(i, "***");
        }
        System.out.println(statement);
    }
}
