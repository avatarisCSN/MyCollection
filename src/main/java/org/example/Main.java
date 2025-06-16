package org.example;

public class Main {

    public static void main(String[] args) {

       // myQueue();
       // myStack();
       //

    }

    public static void myStack(){
        MyStack stack = new MyStack<>();
        String str = new String("111");
        String str2 = new String("222");
        String str3 = new String("333");

        stack.push(str);
        stack.push(str2);
        stack.push(str3);

        System.out.println(stack.peek());

        System.out.println(stack.pop());   // уберет 333

        System.out.println(stack.peek());

        stack.remove(1);   // уберет 222

        stack.clear();
        System.out.println(stack.peek());
    }


    public static void myQueue(){
        MyQueue queue = new MyQueue<>();
        String str = new String("111");
        String str2 = new String("222");

        queue.add(str);
        queue.add(str2);
        queue.add(new String("333"));

        System.out.println(queue.peek());

        System.out.println(queue.poll());   // уберет 111

        System.out.println(queue.peek());


        queue.clear();
        System.out.println(queue.peek());
    }
}