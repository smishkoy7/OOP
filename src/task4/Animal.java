package task4;

public class Animal {
    protected byte age;
    protected String name;
    protected float weight;
    protected float height;

    public Animal(){}

    public byte getAge() {
        return age;
    }

    public Animal withAge(byte age) {
        this.age = age;
        return this;
    }

    public String getName() {
        return name;
    }

    public Animal withName(String name) {
        this.name = name;
        return this;
    }

    public float getWeight() {
        return weight;
    }

    public Animal withWeight(float weight) {
        this.weight = weight;
        return this;
    }

    public float getHeight() {
        return height;
    }

    public Animal withHeight(float height) {
        this.height = height;
        return this;
    }

    public void printAnimalInfo() {
        System.out.println(this.getName());
        System.out.println(this.getAge());
        System.out.println(this.getWeight());
        System.out.println(this.getHeight());
    }
}