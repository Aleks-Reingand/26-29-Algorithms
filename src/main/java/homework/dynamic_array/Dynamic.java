package homework.dynamic_array;

public interface Dynamic {
    void add(int data);
    void addAt(int index, int data);
    void remove();
    void removeAt(int index);
    void growSize();
    void shrinkSize();
    void set(int index, int data);
    int get(int index);
    void clear();
    boolean contains(int data);
    boolean isEmpty();

    int size();

}
