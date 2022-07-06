package lecture.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class MainQueue {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>((s1, s2) -> s2.length() - s1.length());

        queue.add("Lisa");
        queue.add("Robert");
        queue.add("John");
        queue.add("Chris");
        queue.add("Angelina");
        queue.add("Joe");
        queue.add("Sasha");

        System.out.println(queue.peek());

        System.out.println(queue);

        Queue<Student> studentQueue = new PriorityQueue<>(new StudentComparator());
        Student student1 = new Student("Aleks", 1);
        Student student2 = new Student("Masha", 3);
        Student student3 = new Student("Ivan", 0);
        Student student4 = new Student("Tom", 2);

        studentQueue.add(student1);
        studentQueue.add(student2);
        studentQueue.add(student3);
        studentQueue.add(student4);

        System.out.println(studentQueue);
        System.out.println(studentQueue.peek());

        Queue<Integer> integerQueue = new PriorityQueue<>();
        integerQueue.add(758);
        integerQueue.add(500);
        integerQueue.add(900);
        integerQueue.add(100);

        for (int i = integerQueue.size(); i > 0; i--) {
            System.out.print(integerQueue.poll() + ", ");
            System.out.println();
        }

        System.out.println(integerQueue.size());

        /*
        In a priority queue, the only guarantee you have is that the head is the lowest (or greatest, depending on your comparison).
        The internal structure is not necessarily a sorted list. Actually, in Java, it's a heap:

        PriorityQueue
        An unbounded priority queue based on a priority heap.

        However, if you do a loop that poll() the first item, then print it, again and again until the priority queue is empty.
        The elements should be printed from the lowest to the greatest element.

        https://docs.oracle.com/javase/7/docs/api/java/util/PriorityQueue.html#:~:text=An%20unbounded%20priority%20queue%20based,does%20not%20permit%20null%20elements.
         */

    }
}
