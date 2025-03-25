public class LinkedList {
    private Node first;
    private Node last;

    public void addFirst(int value) {
        if(first == null) {
            first = new Node(value, null);
            last = first;
            return;
        }
        Node temp = first;
        first = new Node(value, temp);
    }

    public void deleteFirst() {
        if(first == null) {
            return;
        }
        first = new Node(first.getNext().getValue(), first.getNext().getNext());
    }

    public boolean contains(int value) {
        Node temp = first;
        while(temp != null) {
            if(temp.getValue() == value) {
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }

    public int indexOf(int value) {
        Node temp = first;
        int index = 0;
        while(temp != null) {
            if (temp.getValue() == value) {
                return index;
            }
            index++;
            temp = temp.getNext();
        }
        return -1;
    }

    public void addLast(int value) {
        Node temp = new Node(value, null);
        if(last == null) {
            last = temp;
            return;
        }
        last.setNext(temp);
        last = temp;
    }

    public void removeLast() {
        Node temp = first;
        while (temp != null) {
            if(temp.getNext().getNext() == null) {
                temp.setNext(null);
                last = temp;
            }
            temp = temp.getNext();
        }
    }

    public void print() {
        Node temp = first;
        while(temp != null) {
            System.out.println(temp);
            temp = temp.getNext();
        }
    }
}
