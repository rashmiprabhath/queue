package org.learn;

public class CircularQueue {


    private final int maxSize;
    private final int[] data;
    private int numberOfElements;
    private int front; // indexes but not values
    private int rear; // indexes but not values

    public CircularQueue(int maxSize) {
        this.maxSize = maxSize;
        this.data = new int[maxSize];

        front = 0;
        rear = -1;
        numberOfElements = 0;
    }

    // enqueue
    public void insert(int value) {
        if (numberOfElements == maxSize) {
            System.out.println("Queue is full, element not inserted");
        } else {
            rear = (rear + 1) % maxSize;
            data[rear] = value;
            numberOfElements++;
        }
    }

    public int remove() {
        if (numberOfElements == 0) {
            System.out.println("Queue is empty!");
            return Integer.MIN_VALUE;
        }

        int val = data[front];
        numberOfElements--;
        if (numberOfElements == 0) {
            front = 0;
            rear = -1;
        } else {
            front = (front + 1) % 4;
        }
        return val;
    }

    public int peekFront() {
        if (numberOfElements == 0) {
            System.out.println("Queue is empty!");
            return Integer.MIN_VALUE;
        }
        return data[front];
    }

    public int getNumberOfElements() {
        return numberOfElements;
    }

    public void printQueue() {
        System.out.println("\nprinting data -----");

        if (numberOfElements == 0) {
            System.out.println("Queue is empty");
            return;
        }

        int index = front - 1;
        for (int i = 0; i < maxSize; i++) {
            index = (index + 1) % 4;
            System.out.printf("index: %d, value: %d  -->  ", index, data[index]);

            if (index == rear) {
                break;
            }
        }

        System.out.println();
        System.out.printf("number of elements : %d %n", numberOfElements);
    }

}
