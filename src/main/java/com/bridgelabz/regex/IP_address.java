package com.bridgelabz.regex;

import java.util.Scanner;

public class IP_address {
    public static void main(String[] args) {
        String regex = "^\\d{1,3}.\\d{1,3}.\\d{1,3}.\\d{1,3}$";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an IP address : ");
        String IP = sc.next();
        System.out.println(IP.matches(regex)? "IP address is valid" : "Invalid");
    }
}
