package org.learn;

public class Main {
    public static void main(String[] args) {

        CircularQueue circularQueue = new CircularQueue(4);
        circularQueue.insert(1);
        circularQueue.insert(2);
        circularQueue.insert(3);
        circularQueue.insert(4);
        circularQueue.insert(5);

        circularQueue.printQueue();

        System.out.printf("\nremoved item : %d %n", circularQueue.remove());

        circularQueue.printQueue();

        System.out.printf("\nremoved item : %d %n", circularQueue.remove());

        circularQueue.printQueue();

        circularQueue.insert(6);

        circularQueue.printQueue();
    }
}