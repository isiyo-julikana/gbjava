package OOP.sem4;

public class MyArrayList<E> {

    private E[] array;
    private int lastIndex = -1;

    public MyArrayList(E[] array) {
        this.array = array;
    }

    public int size(){
        return lastIndex + 1;
    }

    public int capacity(){
        return array.length;
    }

    public void add(E item){
        array[++lastIndex] = item;
    }


}
