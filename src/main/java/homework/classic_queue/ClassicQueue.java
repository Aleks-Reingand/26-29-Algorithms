package homework.classic_queue;

/**
 * @author Aleks Reingand
 *
 * This class implements a classic queue using an array for implementation.
 * The direction of the queue is right to left.
 * The head of the queue is at index 0, the tail is at the last index of the array
 * Elements are added to the end of the queue and removed from the beginning.
 */
public class ClassicQueue {

    // pushToEnd(int data) Push an element at the end of queue.
    // remove() Remove an element from the beginning of the queue and returns it. Reducing the size of the queue by one.
    // peek() Return an element at the beginning of the queue without deleting it.
    // isEmpty() Checks if queue is empty or not.
    // size() Return total number of elements present in the queue.

    private int[] arr;      // array for save elements a queue
    private int head;       // head is point to first element of queue
    private int tail;       // tail is point to end element of queue
    private int capacity;   // max capacity of queue
    private int count;      // current size of queue

    public ClassicQueue(int size) {
        arr = new int[size];
        capacity = size;
        head = 0;
        tail = -1;
        count = 0;
    }

    /**
     * Push an element at the end of queue.
     * @param data is the element for inserting
     */
    public void pushToEnd(int data) {
        if (size() == capacity) {
            System.out.println("Queue overflow, delete unnecessary items");
            return;
        }

        tail = (tail + 1) % capacity;
        arr[tail] = data;
        count++;
        System.out.println("Success: " + data + " added to the queue");
    }

    /**
     * Remove an element from the beginning of the queue and returns it. Reducing the size of the queue by one.
     */
    public int remove() {
        if (isEmpty()) {
            System.out.println("No elements in queue");
            return -1;
        }

        int element = arr[head];
        moveQueue();
        count--;
        return element;
    }

    private void moveQueue() {
        for (int i = 1; i <= count; i++) {
            arr[i - 1] = arr[i];
        }
    }

    /**
     * Return an element at the beginning of the queue without deleting it.
     * @return element from queue
     */
    public int peek() {
        if (isEmpty()) {
            System.out.println("No elements in queue");
            return -1;
        }

        return arr[head];
    }

    /**
     * Checks if queue is empty or not.
     * @return boolean
     */
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * Return total number of elements present in the queue.
     * @return current size of queue
     */
    public int size() {
        return count;
    }
}
