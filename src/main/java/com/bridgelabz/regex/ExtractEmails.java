package com.bridgelabz.regex;

import java.util.regex.*;

public class ExtractEmails {
    public static void main(String[] args) {
        String regex = "[A-Za-z\\d]+@[a-z]+\\.[a-z]+";
        String statement = "Contact us at support@example.com and info@company.org and live@long.com";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(statement);


        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
