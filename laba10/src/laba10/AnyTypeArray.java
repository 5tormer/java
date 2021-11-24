package laba10;

public class AnyTypeArray <E> {
    private E [] arr;

    public E getIndex(int i){
        return  arr[i] ;
    }

    public void setArray( E [] arr){
        this.arr =  arr;
    }

    public int getLength(){
        return  arr.length ;
    }
}
