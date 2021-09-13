/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Phi-Hung Tran
 */

import java.util.Scanner;


public class ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //getting input
        System.out.print("What is the input string?");
        String str = input.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) { //counts the number of characters in the string
            if (str.charAt(i) != ' ') ;
            count++;

        }
        System.out.println("\n" + str + " has " + count + " characters");
    }
}
