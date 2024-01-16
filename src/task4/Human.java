package task4;

public class Human {
    protected byte age;
    protected String surname;
    protected String name;
    protected float weight;
    protected float height;
    protected  String sex;
    public Human(){}

    public byte getAge() {
        return age;
}

    public Human withAge(byte age) {
        this.age = age;
        return this;
    }

    public String getName() {
        return name;
    }

    public Human withName(String name) {
        this.name = name;
        return this;
    }

    public String getSurName() {
        return surname;
    }

    public Human withSureName(String surname) {
        this.surname = surname;
        return this;
    }
    public float getWeight() {
        return weight;
    }

    public Human withWeight(float weight) {
        this.weight = weight;
        return this;
    }

    public float getHeight() {
        return height;
    }

    public Human withHeight(float height) {
        this.height = height;
        return this;
    }

    public String getSex() {
        return sex;
    }

    public Human withSex(String sex) {
        this.sex = sex;
        return this;
    }
    public void printHumanInfo() {
        System.out.println(this.getName());
        System.out.println(this.getSurName());
        System.out.println(this.getAge());
        System.out.println(this.getWeight());
        System.out.println(this.getHeight());
    }
    }
