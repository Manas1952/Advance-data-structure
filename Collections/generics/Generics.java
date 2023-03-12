package Collections.generics;

import java.util.ArrayList;

class MyGeneric<T> {
    private T object;

    void add(T object) {
        this.object = object;
    }

    T get() {
        return object;
    }
}

public class Generics {
    public static <E> void print(E[] array) {
        for (E element: array){
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyGeneric<Integer> myGeneric = new MyGeneric();

        System.out.println(myGeneric);

        myGeneric.add(1);
        myGeneric.add(2);
        myGeneric.add(3);

        System.out.println(myGeneric.get());

        Integer[] array = {1, 2, 3};

        print(array);
    }
}
