package laba9;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo(){
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.println("Enter an integer");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2/i);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException happened");
        }
        catch (Exception e){
            System.out.println("Exception happened");
        }
        finally {
            System.out.println("FINALLY!");
        }
    }
    public static void main(String[] args) {
        Exception2 yeet = new Exception2();
        yeet.exceptionDemo();
    }
}
