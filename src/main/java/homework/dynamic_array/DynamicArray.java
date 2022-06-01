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
        array = new int[capacity];
        count = 0;
        size = capacity;
    }

    /**
     * to add an element at the end of array
     *
     * @param data is data
     */
    @Override
    public void add(int data) {
        // check no of elements is equal to size of array
        if (count == size) {
            growSize(); // make array size double
        }
        array[count] = data;
        count++;
    }

    /**
     * to add an element at given index
     *
     * @param index is point
     * @param data  is data
     */
    @Override
    public void addAt(int index, int data) {
        if (count == size) { // if size is not enough make size double
            growSize();
        }

        for (int i = count - 1; i >= index; i--) {
            array[i + 1] = array[i]; // shift all element right from given index
        }
        array[index] = data; // insert data at given index
        count++;
    }

    /**
     * to remove last element or put zero at last index
     */
    @Override
    public void remove() {
        if (count > 0) {
            array[count - 1] = 0;
            count--;
        }
    }

    /**
     * to remove element of index
     *
     * @param index is point
     */
    @Override
    public void removeAt(int index) {
        if (count > 0) {
            for (int i = index; i < count - 1; i++) {
                array[i] = array[i + 1]; // shift all element of right side from given index in left
            }
            array[count - 1] = 0;
            count--;
        }
    }

    /**
     * it makes size double of array
     */
    @Override
    public void growSize() {
        int[] temp = new int[0];
        if (count == size) {
            // temp is a double size array of array and store array elements
            temp = new int[size * 2];
            for (int i = 0; i < size; i++) {
                temp[i] = array[i]; // copy all array value into temp
            }
        }
        array = temp;
        size = size * 2;
    }

    /**
     * it reduces the size of the array, removes empty cells
     */
    @Override
    public void shrinkSize() {
        int[] temp = new int[0];
        if (count > 0) {
            temp = new int[count]; // temp is a count size array and store array elements
            for (int i = 0; i < count; i++) {
                temp[i] = array[i]; // copy all array value into temp
            }
            size = count;
            array = temp;
        }
    }

    @Override
    public void set(int index, int data) {
        if (index < count) {
            array[index] = data;
        }
    }

    /**
     * to get element by index
     *
     * @param index is point
     * @return element
     */
    @Override
    public int get(int index) {
        return array[index];
    }

    /**
     * remove all elements
     */
    @Override
    public void clear() {
        int[] temp = new int[size]; // size = 4;
        array = temp;
        count = 0;
    }

    /**
     * the method checks for the occurrence of the element
     *
     * @param data is data
     */
    @Override
    public boolean contains(int data) {
        for (int idx = 0; idx < size; idx++) {
            if (array[idx] == data) {
//                System.out.println("array contains the element: " + data);
                return true;
            }
//            System.out.println("array does not contain an element: " + data);
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;

//        System.out.println(count == 0 ? "array is empty" : "array contains " + (count - 1) + "elements");
    }

    @Override
    public int size() {
        return count == 0 ? 0 : count - 1;
    }
}
