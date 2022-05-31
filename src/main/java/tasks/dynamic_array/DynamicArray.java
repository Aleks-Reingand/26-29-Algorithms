package tasks.dynamic_array;

public class DynamicArray implements Dynamic {
    private final static int INITIAL_SIZE = 1;

    private int[] array;
    private int count;
    private int size;

    public DynamicArray() {
        this.size = INITIAL_SIZE;
        this.array = new int[this.size];
        this.count = 0;
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
        if (index < 0 || index > count) {
            return;
        }

        if (count == size) {
            growSize(); // make array size double
        }

        int[] newArray = new int[size];

        for (int i = 0; i < count; i++) {
            if (i < index) {
                newArray[i] = array[i];
            } else if (i == index) {
                newArray[i] = data;
                newArray[i + 1] = array[i];
            } else { // i > index
                newArray[i + 1] = array[i];
            }
        }

        count++;
        array = newArray;
    }

    @Override
    public void remove() {
        if (count > 0) {
            count--;
            array[count] = 0;
        }
    }

    @Override
    public void removeAt(int index) {
        if (index < 0 || index > count) {
            return;
        }

        int[] newArray = new int[size];

        for (int i = 0; i < count; i++) {
            if (i < index) {
                newArray[i] = array[i];
            } else if (i + 1 < count) {
                newArray[i] = array[i + 1];
            }
        }

        count--;
        array = newArray;
    }

    @Override
    public void growSize() {
        int newSize = size * 2;
        int[] newArray = new int[newSize];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        array = newArray;
        size = newSize;
    }

    @Override
    public void shrinkSize() {
        int newSize = count;
        int[] newArray = new int[newSize];

        for (int i = 0; i < newSize; i++) {
            newArray[i] = array[i];
        }

        array = newArray;
        size = newSize;
    }

    @Override
    public void set(int index, int data) {
        if (index >= 0 && index < count) {
            array[index] = data;
        }
    }

    @Override
    public int get(int index) {
        return index >= 0 && index < count ? array[index] : -1;
    }

    @Override
    public void clear() {
        array = new int[size];
        count = 0;
    }

    @Override
    public int contains(int data) {
        for (int i = 0; i < count; i++) {
            if (array[i] == data) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }
}
