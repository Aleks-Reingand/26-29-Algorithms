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
    void contains(int data);
    void isEmpty();

    int size();

}
