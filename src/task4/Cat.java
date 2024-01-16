package task4;

import java.util.Random;

public class Cat extends Animal {
    private float tailLength;

    public float getTailLength() {
        return tailLength;
    }

    public Cat withTailLength(float tailLength) {
        this.tailLength = tailLength;
        return this;
    }

    public void printCatInfo() {
        super.printAnimalInfo();
        System.out.println(this.getTailLength());
    }

    public static Cat generateCat() {
        return (Cat) new Cat()
                .withTailLength(new Random().nextFloat(100))
                .withName("Cat " + new Random().nextInt(100))
                .withAge((byte) new Random().nextInt(10))
                .withHeight(new Random().nextFloat(100))
                .withWeight(new Random().nextFloat(100));
    }

}