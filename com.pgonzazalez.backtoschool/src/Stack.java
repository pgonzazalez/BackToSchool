public class Stack {

    int[] stackArray = new int[5];
    int count;

    public void push(int item) {
        stackArray[count++] = item;
    }

    public int pop() {
        return stackArray[count--];
    }

    public int peek(){
        return stackArray[count - 1];
    }

    public boolean isEmpty() {
        return count == 0;
    }
}
