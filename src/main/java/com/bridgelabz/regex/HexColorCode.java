package com.bridgelabz.regex;

public class HexColorCode {
    public static void main(String[] args) {
        String regex = "^#[A-Z]+\\d+$";
        String code = "#FFA500";
        System.out.println(code.matches(regex) ? "valid ": "unvalid");
    }
}
