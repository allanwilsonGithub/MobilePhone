package com.allanWilson;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	    printInstructions();
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();
	    scanner.nextLine();
	    switch (choice) {
            case 0:
                printInstructions();
                break;
        }
    }

    public static void printInstructions(){
        System.out.println("\nMobile Phone Instructions");
        System.out.println("\t 0 - Print these instructions.");
        System.out.println("\t 1 - List contacts.");
        System.out.println("\t 2 - Add contact.");
        System.out.println("\t 3 - Modify contact.");
        System.out.println("\t 4 - Remove contact.");
        System.out.println("\t 5 - Query contact.");
    }
}
