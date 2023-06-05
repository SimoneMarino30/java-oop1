//Esercizio 1 : Java Shop
// 🟩 Nel progetto java-oop-1, package org.lessons.java.shop, creare la classe Prodotto che gestisce i prodotti dello shop.
// Un prodotto è caratterizzato da:
// - 🟩 codice (numero intero)
// - 🟩 nome
// - 🟩 descrizione
// - 🟩 prezzo
// - 🟩 iva

// Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e setter
// ed eventuali altri metodi di “servizio” per fare in modo che:

// - 🟩 alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random
// - 🟩 Il codice prodotto sia accessibile solo in lettura
// - 🟩 Gli altri attributi siano accessibili sia in lettura che in scrittura
// - 🟩 Il prodotto esponga sia un metodo per avere il prezzo base che uno per avere il prezzo comprensivo di iva
// - 🟩 Il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome
// 🟩 Nello stesso package aggiungete una classe Main con metodo main nella quale testate tutte le funzionalità della classe Prodotto
// BONUS: create un metodo che restituisca il codice con un pad left di 0 per arrivare a 8 caratteri
// (ad esempio codice 91 diventa 00000091, mentre codice 123445567 resta come è) Buon lavoro!

package org.lessons.java.shop;

import java.util.Random;

public class Product {
    // CONSTANTS

    // FIELDS o ATTRIBUTI
    private int code;
    private String name;
    private String description;
    private double price;
    private int vatNumber;

    // CONSTRUCTORS

    public Product(String name, String description, double price, int vatNumber) { // costruttore con parametri
        this.code = new Random().nextInt(0, 999);
        this.name = name;
        this.description = description;
        this.price = price;
        this.vatNumber = vatNumber;
    }

    // GETTERS (myProduct)
    public int getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public double getPrice() {
        return this.price;
    }

    public int getVatNumber() {
        return this.vatNumber;
    }

    // SETTERS (yourProduct)

    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setVatNumber(int vatNumber) {
        this.vatNumber = vatNumber;
    }

    // METHODS
    public double getVatNumberPrice() {
        return price + price * vatNumber / 100;
    }

    public String getNamePlusCode() {
        return name + "-" + code;
    }

    public void printYourProduct() {
        System.out.println("CODE: " + getCode());
        System.out.println("NAME: " + name);
        System.out.println("DESCRIPTION: " + description);
        System.out.println("PRICE: " + price + "€");
        System.out.println("VAT NUMBER: " + vatNumber + "%");
        System.out.println("FULL PRICE WITH VAT %: " + getVatNumberPrice() + "€");
        System.out.println("FULL NAME WITH CODE: " + getNamePlusCode());
    }
}
