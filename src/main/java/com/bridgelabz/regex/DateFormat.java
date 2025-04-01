package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateFormat {
    public static void main(String[] args) {
        String statement ="The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        String regex = "\\d{2}/\\d{2}/\\d{4}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(statement);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
