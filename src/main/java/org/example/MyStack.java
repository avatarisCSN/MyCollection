package org.example;

import java.util.Arrays;

public class MyStack<E> {
    private Object[] array;
    private int size=0;
    private Object buffer;

    public void ensureCapacity(){
        if(size==array.length){
            Arrays.copyOf(array, array.length*2);
        }
    }

    public MyStack() {
        array = new Object[10];
    }

    public void push(E value){
        ensureCapacity();
        System.out.print("Pushing value, array length - "+array.length+" size - "+size+" - ");
        for (int i = 0; i < array.length; i++){
            if(array[i]==null){
                array[i] = value;
                System.out.println("push an value into "+i);
                break;
            }
        }
        size++;
    }

    public void remove(int index) {
        System.out.println("Removed element - "+array[index]+"with index - "+index);
        array[index] = null;
        for(int i = 0; i < size; i++){
            System.out.println("Removing - "+array[i]+" "+array[i+1]);
            System.out.println("Index - "+i+" "+(i+1));
            array[i] = array[i+1];
            System.out.println("Removed - "+array[i]+" "+array[i+1]+"\n");

            if(array[i] == null && array[i+1] == null){
                System.out.println("breaked - " + (i+1));
                break;
            }
        }
        size--;

    }

    public void clear(){
        System.out.println("");

        for(int i = 0; i < size; i++){
            System.out.print(array[i]+" ");
            array[i]=null;
        }
        size = 0;
        System.out.println("Stack is cleared");
    }

    public int size() {
        return size;
    }

    public Object peek(){
        System.out.print("Peeking an element - "+size+" "+array[size]+" - ");
        if(size!=0){
            return array[size-1];
        } else {
            return null;
        }

    }

    public Object pop(){
        buffer = array[size];
        for(int i = 0; i < size; i++){
            System.out.println("Poping - "+array[i]+" "+array[i+1]);
            System.out.println("Index - "+i+" "+(i+1));
            array[i] = array[i+1];
            System.out.println("Poped - "+array[i]+" "+array[i+1]+"\n");

            if(array[i] == null && array[i+1] == null){
                System.out.println("breaked - " + (i+1));
                break;
            }
        }

        size--;
        return buffer;
    }
}
