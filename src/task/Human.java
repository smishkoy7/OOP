package task;

public class Human {
    private int age;
    private float height;

    public int getAge(){
        return age;
    }
    public void setAge(int age){
         this.age = age;
    }
    public float getHeight(){
        return height;
    }
    public void setHeight(float height){
        this.height = height;
    }
    public Human(int age, float height){
        this.age = age;
        this.height = height;
    }
}
