package laba10;

import java.util.LinkedList;
import java.util.List;

public class ArrayToList {

    public ArrayToList(){
        String [] str = {"Hello","World","!","Number","9", "and", "number", "6"};

        List <String> list = new LinkedList();

        for(int i=0;i< str.length; i++){
            list.add(str[i]);
            System.out.print(list.get(i)+" ");
        }
    }

}
