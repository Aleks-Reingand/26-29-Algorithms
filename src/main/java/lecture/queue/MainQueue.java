package lecture.queue;


import java.util.PriorityQueue;
import java.util.Queue;

public class MainQueue {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>(new StringComparator());
        queue.add("we");
        queue.add("are");
        queue.add("studying");
        queue.add("the");
        queue.add("Queue");
        queue.add("interface");

        System.out.println(queue.peek());

        System.out.println(queue);

        Queue<Student> studentQueue = new PriorityQueue<>(new StudentComparator());
        Student student1 = new Student("Aleks", 1.4);
        Student student2 = new Student("Masha", 3.6);
        Student student3 = new Student("Ivan", 0.9);

        studentQueue.add(student1);
        studentQueue.add(student2);
        studentQueue.add(student3);

        System.out.println(studentQueue);
        System.out.println(studentQueue.peek());

    }
}
