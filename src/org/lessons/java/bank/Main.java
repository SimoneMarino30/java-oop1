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

        System.out.println("Your balance after deposit is : " + account.putMoney() + " €");
        System.out.println("Your balance after withdraw  is: " + account.getMoney() + " €");

        scan.close();


    }
}
