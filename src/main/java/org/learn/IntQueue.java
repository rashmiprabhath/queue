package org.learn;

public class IntQueue {

    private final int maxSize;
    private final int[] data;
    private int numberOfElements;
    private int front; // indexes but not values
    private int rear; // indexes but not values

    public IntQueue(int maxSize) {
        this.maxSize = maxSize;
        this.data = new int[maxSize];

        front = 0;
        rear = -1;
        numberOfElements = 0;
    }

    // enqueue
    public void insert(int value) {
        if (rear == maxSize - 1) {
            System.out.println("Queue is full, element not inserted");
        } else {
            rear = rear + 1;
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
            front = front + 1;
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
        for (int i = front; i <= rear; i++) {
            System.out.printf("index: %d, value: %d  -->  ", i, data[i]);
        }
        System.out.println();
        System.out.printf("number of elements : %d %n", numberOfElements);
    }

}
