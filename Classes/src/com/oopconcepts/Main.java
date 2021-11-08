package com.oopconcepts;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
        Car porsche = new Car();
        Car holden = new Car();
        System.out.println(porsche.getModel()); // null
        porsche.setModel("Carrera");
        System.out.println(porsche.getModel()); // Carrera (Not null)
        */

        Bank b1 = new Bank();
        Bank b2 = new Bank("Mann Mehta", "301102230441", 0, "mannmehta2199@gmail.com", "1123311233");
        System.out.println("B1 Details");
        b1.getAccountDetails();
        System.out.println("B2 Details");
        b2.getAccountDetails();
        boolean isSignOff = false;
        while(!isSignOff) {
            int choice;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Menu");
            System.out.println("1. Deposit Amount");
            System.out.println("2. Withdraw Amount");
            System.out.println("3. Sign off");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 1:
                    System.out.println("Enter amount to be deposit - ");
                    int amount = scanner.nextInt();
                    scanner.nextLine();
                    b1.depositAmount(amount);
                    break;
                case 2:
                    System.out.println("Enter amount to be withdraw - ");
                    amount = scanner.nextInt();
                    scanner.nextLine();
                    b1.withdrawAmount(amount);
                    break;
                case 3:
                    System.out.println("Sign off Successful");
                    isSignOff = true;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

    }
}
