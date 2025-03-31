public class ArrayQueue {
    private int[] queue = new int[5];
    int size;

    public void enqueue(int item) {
        if(isFull()) {
            System.out.println("Queue is full");
            return;
        }
        queue[size++] = item;
    }

    public int dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int firstElement = queue[0];
        for(int i = 0; i < size - 1; i++) {
            queue[i] = queue[i + 1];
        }
        size--;
        return firstElement;
    }

    public int peek() {
        return queue[0];
    }

    private boolean isEmpty() {
        return size == 0;
    }

    private boolean isFull() {
        return size == queue.length;
    }

    @Override
    public String toString() {
        String elements = "";
        for(int i = 0; i < size; i++) {
            elements += queue[i] + "\n";
        }
        return elements;
    }
}
