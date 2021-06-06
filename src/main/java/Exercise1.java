/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Fouad Braimoh
 */

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner UserInput = new Scanner(System.in);
        String Name = UserInput.nextLine();

        String Line = "Hello, "+Name+" nice to meet you!";

        System.out.println(Line);
    }
}
