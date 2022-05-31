package homework.dynamic_array;

import java.util.NoSuchElementException;

public class DynamicArrayIterator {
    private Dynamic array;
    private int index = 0;

    public DynamicArrayIterator(Dynamic array) {
        this.array = array;
    }

    public boolean hasNext() {
        return index <= array.size();
    }

    public int next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return array.get(index++);
    }
}
