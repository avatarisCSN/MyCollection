package org.example;

import java.util.Arrays;

public class MyQueue<E> {
    private Object[] array;
    private int size=0;
    private Object buffer;

    public MyQueue(){
        array = new Object[10];
    }

    public void ensureCapacity(){
        if(size==array.length){
            Arrays.copyOf(array, array.length*2);
        }
    }

    public void add(E value){
        ensureCapacity();
        System.out.print("Adding value, array length - "+array.length+" - ");
        for (int i = 0; i < array.length; i++){
            if(array[i]==null){
                array[i] = value;
                System.out.println("put an value into "+i);
                break;
            }
        }
        size++;
    }

    public void clear(){
        System.out.println("");

        for(int i = 0; i < size; i++){
            System.out.print(array[i]+" ");
            array[i]=null;
        }
        System.out.println("Queue is cleared");
    }

    public int size(){
        return array.length;
    }

    public Object peek(){
        System.out.print("Peeking an element - ");
        return array[0];
    }

    public Object poll(){
        buffer = array[0];
        for(int i = 0; i < size; i++){
            System.out.println("Polling - "+array[i]+" "+array[i+1]);
            System.out.println("Index - "+i+" "+(i+1));
            array[i] = array[i+1];
            System.out.println("Polled - "+array[i]+" "+array[i+1]+"\n");

            if(array[i] == null && array[i+1] == null){
                System.out.println("breaked - " + (i+1));
                break;
            }
        }

        size--;
        return buffer;
    }

}
