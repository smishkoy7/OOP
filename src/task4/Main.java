package task4;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        // generate array of different cat objects using stream
        Cat[] cats = Stream.generate(Cat::generateCat).limit(10).toArray(Cat[]::new);
        Dog[] dogs = Stream.generate(Dog::generateDog).limit(10).toArray(Dog[]::new);
        Male[] males = Stream.generate(Male::generateMale).limit(5).toArray(Male[]::new);
        System.out.println("Cats:");
        for (Cat cat : cats) {
            cat.printCatInfo();
            System.out.println("-----");
        }

        System.out.println("Dogs:");
        for (Dog dog : dogs) {
            dog.printDogInfo();
            System.out.println("-----");
        }
        System.out.println("Men:");
        for (Male male :males) {
            male.printMaleInfo();
            System.out.println("-----");
        }

    }
}