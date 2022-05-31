package tasks.dynamic_array;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        DynamicArray dynArray = new DynamicArray();
        dynArray.add(11);
        dynArray.add(22);
        dynArray.add(33);

        dynArray.clear();
        dynArray.add(44);
        dynArray.add(55);
        dynArray.set(2, 77);
        dynArray.addAt(2, 88);
        dynArray.removeAt(2);
        dynArray.addAt(0, -5);

        dynArray.remove();
    }
}
