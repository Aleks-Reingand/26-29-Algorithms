package homework.dynamic_array;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dynamic dynamicArray = new DynamicArray();
        dynamicArray.add(0);
        dynamicArray.add(0);
        dynamicArray.add(0);

//        dynamicArray.clear();

        dynamicArray.isEmpty();

        ArrayList arrayList = new ArrayList<>();
        System.out.println("size " + arrayList.size());

        DynamicArrayIterator dynamicArrayIterator = new DynamicArrayIterator(dynamicArray);
        while (dynamicArrayIterator.hasNext()) {
            System.out.println(dynamicArrayIterator.next());
        }
    }
}
