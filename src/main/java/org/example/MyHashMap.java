package org.example;

public class MyHashMap<E> {
    private MyHashMap.Node<E> first;
    private MyHashMap.Node<E> last;
    private int size=0;
    private static class Node<E>{
        E value;
        MyHashMap.Node<E> next;
        MyHashMap.Node<E> prev;
        Node(MyHashMap.Node<E> prev, E value, MyHashMap.Node<E> next) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public void put(Object key, Object value) {

    }

    public void remove(Object key) {

    }

    public void clear() {

    }

    public void size() {

    }

    public void get(Object key) {
        
    }
}
