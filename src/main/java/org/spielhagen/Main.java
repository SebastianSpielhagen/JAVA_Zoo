package org.spielhagen;

public class Main {
    public static void main(String[] args) {
        // Create an Animal object
        Animal lion = new Animal(1, "Leo", "Lion", 5);

        // Print the details of the animal
        System.out.println("Tier ID: " + lion.id());
        System.out.println("Tiername: " + lion.name());
        System.out.println("Tierart: " + lion.species());
        System.out.println("Alter des Tieres: " + lion.age());
        System.out.println("Gefährlich: NEIN - Der will nur spielen! :-)");
                  }
}