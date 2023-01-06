package com.stackAndQueue;

public class Queue_UC4
{
    public static void main(String[] args)
    {
        QueueClass list = new QueueClass();

        //enqueue
        list.add(56);
        list.add(30);
        list.add(70);

        list.Print();
        System.out.println();
        //dequeue
        list.remove();
        list.Print();
    }
}
