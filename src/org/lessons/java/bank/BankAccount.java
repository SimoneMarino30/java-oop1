// Esercizio 2: Java Bank
// Nel progetto java-oop-1, org.lessons.java.bank, creare la classe Conto caratterizzata da:
//- 🟩 numero di conto
//- 🟩 nome del proprietario
//- 🟩 saldo

//Usate opportunamente i livelli di accesso (public, private), i costruttori,
// i metodi getter e setter ed eventuali altri metodi di “servizio” per fare in modo che:

//  - alla creazione di un nuovo conto il saldo sia 0€ 🟩
//  - Il codice conto sia accessibile solo in lettura, 🟩
//  - il proprietario sia accessibile in lettura e in scrittura 🟩
//  - e il saldo sia accessibile solo in lettura 🟩
//  - siano presenti un metodo per versare una somma di denaro sul conto 🟩
//  - e uno per prelevare una somma di denaro dal conto 🟩
//   (attenzione: il saldo non può mai diventare negativo) 🟩

//- altri metodi per ritornare le informazioni del conto e il saldo formattato

//Aggiungere una classe Bank con metodo main, 🟩
// dove chiediamo all’utente il suo nome  🟩
// e generiamo un Conto intestato all’utente  🟩
// con un numero di conto random (da 1 a 1000) 🟩

// Poi chiediamo all’utente cosa vuole fare dando 3 opzioni:
// 1- versare una somma 🟩
// 2- o prelevare una somma di denaro, 🟩
// 3- oppure uscire. 🟩
// Dopo la scelta dell’utente chiediamo quanti soldi vuole versare
// o prelevare e proviamo ad effettuare l’operazione sul conto. 🟩

// Se l’operazione non è valida mostriamo un messaggio di errore. 🟩
// Se l’operazione va a buon fine mostriamo il saldo attuale del conto. 🟩
// Il menu continua ad apparire fino a che l’utente sceglie di uscire. 🟩

package org.lessons.java.bank;

import java.util.Random;
import java.util.Scanner;

public class BankAccount {
    // FIELDS o ATTRIBUTI
    private int accountNumb;
    private String username;

    private double balance;

    // CONSTRUCTORS
    public BankAccount(String username, double balance) {
        this.accountNumb = new Random().nextInt(1, 1000);
        this.username = getUsername(); // Richiedo il nome utente nel main con lo scanner
        this.balance = balance;
    }

    // GETTERS

    public int getAccountNumb() {
        return this.accountNumb;
    }

    public String getUsername() {
        return this.username;
    }

    public double getBalance() {
        return this.balance;
    }

    // SETTERS
    public void setName(String username) {
        this.username = username;
    }

    // METHODS
    public double putMoney() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How much money do you want to deposit? ");
        double depositedMoney = scan.nextDouble();
        balance += depositedMoney;
        // scan.close();
        return balance;
    }

    public double getMoney() {

        Scanner scan = new Scanner(System.in);
        System.out.print("How much do you want to withdraw? ");
        double withdrawMoney = scan.nextDouble();
        if(withdrawMoney <= balance) {
            balance -= withdrawMoney;
            System.out.println("Your current balance is: " + balance);
        } else {
            System.out.println("Sorry, your current balance is: " + balance + " you can't withdraw");
        }
        scan.close();
        return balance;
    }

}
