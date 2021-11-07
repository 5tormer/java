package pr9;

import java.math.BigInteger;
import java.util.Scanner;

public class Main extends InnException{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фамилию");
        scanner.next();
        System.out.println("Введите инн");
        long inn;
        while (true) {
            try {
                inn = scanner.nextLong();
                checkInn(inn);
                validInn();
                break;
            } catch (InnException e) {
                e.ExceptionMessage();
            }
        }
    }
}