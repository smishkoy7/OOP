package task4;

import java.util.Random;

public class Dog extends Animal{
    private boolean trainability;
    private String breed;

    public boolean isTrainability() {
        return trainability;
    }

    public Dog withTrainability(boolean trainability) {
        this.trainability = trainability;
        return this;
    }

    public String getBreed() {
        return breed;
    }

    public Dog withBreed(String breed) {
        this.breed = breed;
        return this;
    }

    public void printDogInfo() {
        super.printAnimalInfo();
        System.out.println(this.getBreed());
        System.out.println(this.isTrainability());
    }

    public static Dog generateDog() {
        return (Dog) new Dog()
                .withBreed("Dog " + new Random().nextInt(100))
                .withTrainability(new Random().nextBoolean())
                .withName("Dog" + new Random().nextInt(100))
                .withAge((byte) new Random().nextInt(10))
                .withHeight(new Random().nextFloat(100))
                .withWeight(new Random().nextFloat(100));
    }
}