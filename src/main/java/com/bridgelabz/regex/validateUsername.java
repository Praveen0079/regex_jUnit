package com.bridgelabz.regex;

public class validateUsername {
    public static void main(String[] args) {
        String username = "user_123";
        String regex = "^[A-Za-z]+_[0-9]+$";

        System.out.println(username.matches(regex) ? "Valid username" : "Invalid username");
    }
}
