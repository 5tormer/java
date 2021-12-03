package pr11;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayQueue array = new ArrayQueue(4);

        array.enqueue(1);

        array.enqueue(2);
        array.enqueue(3);
        array.enqueue(4);
        System.out.println("---"+array.size());
        array.print();
        array.dequeue();
        System.out.println();
        array.print();
        System.out.println("---"+array.size());
        array.clear();
        array.print();
        System.out.println(array.isEmpty());
    }
}
