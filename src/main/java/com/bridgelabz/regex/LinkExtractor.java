package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LinkExtractor {
    public static void main(String[] args) {
        String statement = "Visit https://www.google.com and http://example.org for more info https://www.bing.com.";
        String regex = "http[s]*://[www]*[a-z\\.]+[a-z]+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(statement);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
