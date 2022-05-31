package homework.dynamic_array;

public class Main {
    public static void main(String[] args) {
        Dynamic dynamicArray = new DynamicArray();
        dynamicArray.add(10);
        dynamicArray.add(12);
        dynamicArray.add(66);

        DynamicArrayIterator dynamicArrayIterator = new DynamicArrayIterator(dynamicArray);
        while (dynamicArrayIterator.hasNext()) {
            System.out.println(dynamicArrayIterator.next());
        }
    }
}
