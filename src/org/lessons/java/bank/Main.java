package org.lessons.java.bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Inserisci il tuo nome: ");
        String pickedUser = scan.nextLine();
        BankAccount account = new BankAccount( pickedUser,  0.0);
        System.out.println("ACCOUNT NUMBER: " + account.getAccountNumb());
        System.out.println("USERNAME : " + pickedUser);
        System.out.println("BALANCE : " + account.getBalance() + " €");

        // OPZIONI PER L' UTENTE
        System.out.println("Choose an option:");
        System.out.println("1. Press 1 if you want to deposit your money");
        System.out.println("2. Press 2 if you want to withdraw your money");
        System.out.println("3. Press 3 if you want to exit");

        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Option 1: ");
                System.out.print("Your balance after deposit is : " + account.putMoney() + " €");
                break;
            case 2:
                System.out.println("Option 2: ");
                System.out.print("Your balance is: " + account.getMoney() + " €");
                break;
            case 3:
                System.out.println("Option 3: ");
                System.out.println("You've choosed to exit, goodbye!");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
        scan.close();


    }
}
