// Java program to demonstrate creating multiple objects

package com.objects;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating object Cat with type Animal
        Animal animal = new Cat();

        // Redoing animal in new object Horse
        animal = new Horse();

        // Redoing animal in new object Cow
        animal = new Cow();
    }
}

class Animal {
    public Animal(){
    }
}

class Cat extends Animal {
    public Cat() {
        System.out.println("I am Cat");
    }
}

class Horse extends Animal {
    public Horse() {
        System.out.println("I am Horse");
    }
}

class Cow extends Animal {
    public Cow() {
        System.out.println("I am Cow");
    }
}