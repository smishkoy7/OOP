package task4;

public class Female extends Human {
    Female female = new Female();
    public Female(){
        this.sex = "Female";
    }
    public String getSex(){
        return "Female";
    }
    public void printFemaleInfo(){
        super.printHumanInfo();
        System.out.println("Пол женщины: " + female.getSex());
    }
}
