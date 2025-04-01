package com.bridgelabz.regex;

import java.util.regex.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCapitalized {
    public static void main(String[] args) {
        String statement = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        String regex = "[A-Z]{1}[a-z]+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(statement);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
