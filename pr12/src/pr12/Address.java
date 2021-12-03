package pr12;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Address {
    public String city;
    public String street;
    public String house;
    public String data;
    Scanner scanner = new Scanner(System.in);

    String getData(){
        System.out.println("Введите адрес");
        return scanner.nextLine();
    }
    void split(String data){
        StringTokenizer splitter = new StringTokenizer(data, " \t\n\r,.");
        city = splitter.nextToken();
        street = splitter.nextToken();
        house = splitter.nextToken();
    }
    void print(){
        System.out.println("Город - " + city + "\nУлица - " + street + "\nДом - " + house);
    }
}
