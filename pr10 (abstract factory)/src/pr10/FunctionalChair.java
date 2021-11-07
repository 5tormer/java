package pr10;

public class FunctionalChair implements Chair{
    String sum(int a, int b){
        return "sum is " + (a+b);
    }
    public void sit(){
        System.out.println("Sitting on a functional chair...");
    }
}
