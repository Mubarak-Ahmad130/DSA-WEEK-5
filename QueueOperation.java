import java.util.Scanner;

public class QueueOperation {
    int front, rear, size;
    int[] queue;

    // Constructor
    QueueOperation(int capacity) {
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Enqueue operation
    void enqueue(int value) {
        if (size == queue.length) {
            System.out.println("Queue Overflow! Cannot enqueue " + value);
        } else {
            rear = (rear + 1) % queue.length;
            queue[rear] = value;
            size++;
            System.out.println(value + " enqueued.");
        }
    }

    // Dequeue operation
    void dequeue() {
        if (size == 0) {
            System.out.println("Queue Underflow! Nothing to dequeue.");
        } else {
            System.out.println(queue[front] + " dequeued.");
            front = (front + 1) % queue.length;
            size--;
        }
    }

    // Peek operation
    void peek() {
        if (size == 0) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Front element: " + queue[front]);
        }
    }

    // Display operation
    void display() {
        if (size == 0) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Queue elements: ");
            for (int i = 0; i < size; i++) {
                System.out.print(queue[(front + i) % queue.length] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        QueueOperation q = new QueueOperation(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.peek();
        q.dequeue();
        q.display();
    }
}

