package task4;

import java.util.Random;
public class Male extends Human {
    private String facialHairStyle;
    private String shavingBeard;
    private float dickLength;


    public Male() {
        this.sex = "Male";
    }

    public String getSex() {
        return "Male";
    }

    public String getFacialHairStyle() {
        return facialHairStyle;
    }

    public String getShavingBeard() {
        return shavingBeard;
    }

    public float getDickLength() {
        return dickLength;
    }

    public Male withDickLength(float dickLength) {
        this.dickLength = dickLength;
        return this;
    }

    public void printMaleInfo() {
        super.printHumanInfo();
        System.out.println(this.getDickLength());
        System.out.println("Пол мужчины: " + this.getSex());
        System.out.println(this.getFacialHairStyle());
    }

    public static Male generateMale() {
        return (Male) new Male()
                .withName("Male" + new Random().nextInt(100))
                .withAge((byte) new Random().nextInt(130))
                .withHeight(new Random().nextFloat(220))
                .withWeight(new Random().nextFloat(150));
    }
}
