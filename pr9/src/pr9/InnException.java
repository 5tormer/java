package pr9;

import java.util.Scanner;

/*public class InnException extends Exception{
    public InnException(int inn){
        if(inn % 12 >= 1 | inn % 12 <=9);
        System.out.println("Введен некорректный инн!");
    }
}*/
public class InnException extends Exception {

    public static void checkInn(long inn) throws InnException {
        if(inn/100000000000L < 1 | inn/100000000000L > 9 | inn<0)
            throw new InnException();
    }
    public static void validInn() {
        System.out.println("Инн действителен");
    }
    public void ExceptionMessage() {
        System.err.println("Введен некорректный инн!");
    }
}