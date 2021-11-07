package pr10;

public class VictorianChair implements Chair{
    int age;

    public VictorianChair() {
        this.age = 0;
    }
    public void sit(){
        System.out.println("Sitting on a victorian chair...");
    }
    public String getAge() {
        return "Victorian Chair age is " + age;
    }
    public VictorianChair(int age){
        this.age = age;
    }
}
