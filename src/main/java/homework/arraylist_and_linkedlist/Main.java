package homework.arraylist_and_linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static final int N_ELEMENTS = 1000000; // size random elements
    public static final int R_ELEMENTS = 1000; // number of choices in the list

    public static void main(String[] args) {
        ArrayList<Double> arrayList = new ArrayList<>();
        LinkedList<Double> linkedList = new LinkedList<>();

        fillList(arrayList);
        fillList(linkedList);

        compareTimeGetElementFromList(arrayList, linkedList);
    }

    private static void compareTimeGetElementFromList(ArrayList<Double> arrayList, LinkedList<Double> linkedList) {

        long startTime = System.currentTimeMillis(); // start time
        for (int i = 0; i < R_ELEMENTS; i++) {
            arrayList.get((int) (Math.random() * (N_ELEMENTS - 1)));
        }
        System.out.println(System.currentTimeMillis() - startTime); // end time

        startTime = System.currentTimeMillis();
        for (int i = 0; i < R_ELEMENTS; i++) {
            linkedList.get((int) (Math.random() * (N_ELEMENTS - 1)));
        }
        System.out.println(System.currentTimeMillis() - startTime);
    }

    private static void fillList (List<Double> list) {
        for (int i = 0; i < N_ELEMENTS; i++) {
            list.add(Math.random());
        }
    }
}
