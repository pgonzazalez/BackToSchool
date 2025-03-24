import java.util.Arrays;

public class Array {
    private int[] elements;
    private int size = 0;
    public Array(int size) {
        elements = new int[size];
    }

    public void insert(int element) {
        resizeIfNeeded();
        elements[size] = element;
        size++;
    }

    public void removeAt(int position) {
        if(position > size) {
            System.out.print("Element does not exist");
        }
        for(int i = position; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
    }

    private void resizeIfNeeded() {
        if(size == elements.length) {
            int[] newArray = new int[elements.length * 2];
            for(int i = 0; i < size; i++) {
                newArray[i] = elements[i];
            }
            elements = newArray;
        }
    }

    public int indexOf(int element) {
        for(int i = 0; i < size; i++) {
            if(elements[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public void print() {
        for(int i = 0; i < size; i++) {
           System.out.print(elements[i] + " ");
        }
    }
}
