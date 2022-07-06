package lecture.my_linkedlist;

public class MyLinkedList {
    Node head;

    public void pushToHead(int data) {
        Node newNode = new Node(data, null);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.setNext(head);
        head = newNode;
    }

    public void pushToTail(int data) {
        Node newNode = new Node(data, null);
        if (head == null) {
            head = newNode;
            return;
        }

        Node last = head;
        while (last.getNext() != null) {
            last = last.getNext();
        }

        last.setNext(newNode);
    }

    public void pushToIndex(int index, int data) {

    }

    public void removeFirst() {

    }

    public void removeLast() {

    }

    public void remove(int index) {

    }

    public int get(int index) {
        return 0;
    }

    public int size() {
        Node node;
        int count = 0;
        for(node = head; node != null; node = node.getNext()) {
            count++;
        }
        return count;
    }

    public void print() {

    }


}
