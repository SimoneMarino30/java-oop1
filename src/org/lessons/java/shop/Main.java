package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        // Nuova istanza di prodotto
        Product myProduct = new Product("biro", "di colore nero", 1.00, 20);

        //Attributi di myProduct (GETTER)
        System.out.println("CODE: " + myProduct.getCode());
        System.out.println("NAME: " + myProduct.getName());
        System.out.println("DESCRIPTION: " + myProduct.getDescription());
        System.out.println("PRICE: " + myProduct.getPrice()+ "€");
        System.out.println("VAT NUMBER: " + myProduct.getVatNumber() + "%");
        System.out.println("FULL PRICE WITH VAT %: " + myProduct.getVatNumberPrice() + "€");
        System.out.println("FULL NAME WITH CODE: " + myProduct.getNamePlusCode());

        System.out.println("------------------------------------------");

        //Attributi di yourProduct (SETTER)
        myProduct.setName("matita");
        myProduct.setDescription("cancellabile");
        myProduct.setPrice(0.8);
        myProduct.setVatNumber(33);

        // Method printYourProduct
        myProduct.printYourProduct();

    }
}
