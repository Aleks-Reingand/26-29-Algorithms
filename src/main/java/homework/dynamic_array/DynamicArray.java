package homework.dynamic_array;

public class DynamicArray implements Dynamic {

    private int[] array;
    private int count;
    private int size;

    public DynamicArray() {
        this.array = new int[1];
        this.count = 0;
        this.size = 1;
    }

    public DynamicArray(int capacity) {
    }

    @Override
    public void add(int data) {
        // check no of elements is equal to size of array
        if (count == size) {
            growSize(); // make array size double
        }
        array[count] = data;
        count++;
    }

    @Override
    public void addAt(int index, int data) {

    }

    @Override
    public int get(int index) {
        return 0;
    }
}
