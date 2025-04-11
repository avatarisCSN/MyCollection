package org.example;

public class MyLinkedList<E> {
    private Node<E> first;
    private Node<E> last;
    private int size=0;
    private static class Node<E>{
        E value;
        Node<E> next;
        Node<E> prev;
        Node(Node<E> prev, E value, Node<E> next) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
    public Node<E> getFirst(){
        return first;
    }
    public Node getLast(){
        return last;
    }
    public int getSize(){
        return size;
    }
    public void addFirst(E value){
        first=new Node(null,value,getFirst());
        size++;
    }
    public void addLast(E value){
        last=new Node(getLast(),value,null);
        size++;
    }
    public void add(E value, int index){

    }

}
