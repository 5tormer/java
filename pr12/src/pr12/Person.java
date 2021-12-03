package pr12;

import java.util.Scanner;

public class Person {
    public String familiya = "";
    public String imya = "";
    public String otchestvo = "";
    Scanner scanner = new Scanner(System.in);

    void getFio(){
        System.out.println("Введите фио");
        familiya = scanner.nextLine();
        imya = scanner.nextLine();
        otchestvo = scanner.nextLine();
    }
    void print(){
        if (familiya != "") {
            System.out.print(familiya + " ");
            if (imya != "" & otchestvo != "")
                System.out.println(imya + " " + otchestvo);
            else
                System.out.print("<Имя и отчетсво не заданы>");
        }
        else
            System.out.println("<Фамилия имя и отчество не заданы>");
    }
}
