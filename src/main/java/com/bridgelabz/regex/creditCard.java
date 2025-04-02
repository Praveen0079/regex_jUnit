package com.bridgelabz.regex;

import java.util.Scanner;

public class creditCard {
    public static void main(String[] args) {
        String regex = "^[45]\\d{15}$";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter card number : ");
        String card = sc.next();
        System.out.println(card.matches(regex)? "Card is valid" : "Invalid . Number should start with 4 or 5 and 16 digits");
    }
}

