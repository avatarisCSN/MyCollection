package org.example;

public class MyHashMap<E, V> {

    private final int SIZE = 1000;
    private Node[] buckets;

    private static class Node<V>{
        int key;
        V value;
        Node next;
        Node( int key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public MyHashMap() {
        buckets = new Node[SIZE];
    }

    private int hash(int key) {
        return Integer.hashCode(key) % SIZE;
    }

    private Node findNode(Node indexed, int key) {
        Node index = indexed;
        while (index.next != null && index.next.key != key) {
            index = index.next;
        }
        return index;
    }


    public void put(int key, Object value) {
        int index = hash(key);
        if (buckets[index] == null) {
            buckets[index] = new Node(-1, -1); // фиктивная голова
        }

        Node prev = findNode(buckets[index], key);
        if (prev.next == null) {
            prev.next = new Node(key, value); // добавляем новый
        } else {
            prev.next.value = value; // обновляем
        }
    }

    public Object get(int key) {
        int index = hash(key);
        if (buckets[index] == null) return -1;

        Node prev = findNode(buckets[index], key);
        if (prev.next == null) return -1;
        return prev.next.value;
    }

    public void remove(int key) {
        int index = hash(key);
        if (buckets[index] == null) return;

        Node prev = findNode(buckets[index], key);
        if (prev.next != null) {
            prev.next = prev.next.next; // пропускаем найденный узел
        }
    }

    public void clear() {
        buckets = new Node[SIZE];
    }

    public int size() {
        int count=0;
        for (int i = 0; i < SIZE; i++) {
            while (buckets[i].next != null ) {
                count++;
            }
        }
        return count;
    }


}
