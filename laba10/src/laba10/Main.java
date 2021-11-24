package laba10;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static <E> void printArray(String s, E [] arr){

        AnyTypeArray <E> sid = new AnyTypeArray <E> ();
        sid.setArray(arr);

        System.out.print(s + "  ");

        for(int i = 0; i< sid.getLength(); i++)
            System.out.print(sid.getIndex(i)+" ");

        System.out.println();
    }

    public static <E> void printFiveElem(E [] arr){
        List<String> list = new LinkedList();
        for(int i = 0; i < 5; i++) {
            list.add(arr[i].toString());
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
	    ArrayToList list = new ArrayToList();
        System.out.println();
        String [] s = {"Hello", "World","!"};
        printArray("String:" , s);

        Integer [] i = { 1,2,3,4,5,6,7,8,9};
        printArray("Integer:" , i);

        printFiveElem(i);
        Double [] d = {5.5,1.5,5.1,2.28,6.9};
        printArray("Double:" , d);
    }
}
