package ForPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class GenericClass <T>{
    private T t;

    public void setT (T t){
        this.t =t;
    }
    public T getT(){
        return t;
    }
    public static <T> void staticMethod(T value){
        System.out.println(value);
    }

    public <E> void printArray (E [] elements){
        for (E element:elements){
            System.out.print(element+ " ");
        }
        System.out.println();
    }

    public <ArrayList> void printRegularArray (ArrayList[] elements){
        for (ArrayList element:elements){
            System.out.print(element+ " ");
        }
        System.out.println();
    }
}
