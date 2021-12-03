package pr11;

import java.util.Arrays;

public class ArrayQueue {
    private int first = 0;
    private int last = 0;
    private int maxSize;
    private int[] array={};

    public ArrayQueue(int size){
        maxSize = size;
        array = new int[maxSize];
    }
    public void enqueue(int elem){
        if(last != maxSize)
        {
            array[last]=elem;
            last++;
        }
        else
            System.out.println("Очередь заполнена");
    }
    public int element(){
        return first;
    }
    public int dequeue(){
        int f = array[first];
        for(int i = 0; i<last-1; i++)
            array[i] = array[i+1];
        array[last-1]=0;
        last--;
        return f;
    }
    public int size(){
        return last;
    }
    public boolean isEmpty(){
        return last == 0;
    }
    public void clear(){
        Arrays.fill(array, 0);
        last = 0;
        first = 0;
    }
    public void print(){
        for(int i=0; i<maxSize; i++)
            System.out.println(array[i]);
    }
}
