package com.bridgelabz.regex;

public class LicensePlateNumber {
    public static void main(String[] args) {
        String regex = "^[A-Z]{2}\\d+$";
        String number = "HP798338";
        System.out.println(number.matches(regex) ? "valid ": "unvalid");
    }
}
