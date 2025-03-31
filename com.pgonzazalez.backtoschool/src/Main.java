public class Main {
    public static void main(String[] args) {
//        Array array = new Array(3);
//        array.insert(10);
//        array.insert(20);
//        array.insert(30);
//        array.removeAt(0);
//        array.insert(40);
//        array.insert(50);
//        array.removeAt(2);
//        System.out.print(array.indexOf(40) + "\n");
//        array.print();
//        LinkedList ll = new LinkedList();
//        ll.addFirst(2);
//        ll.addFirst(5);
//        ll.addFirst(8);
//        ll.addFirst(10);
//        ll.deleteFirst();
//        System.out.println(ll.contains(2));
//        System.out.println(ll.contains(40));
//        System.out.println(ll.indexOf(8));
//        System.out.println(ll.indexOf(24));
//        ll.addLast(50);
//        ll.addFirst(0);
//        ll.removeLast();
//        ll.print();

//        String testStacks = "abc";
//        Stack<Character> stack = new Stack<>();
//
//        for(Character ch : testStacks.toCharArray()) {
//            stack.push(ch);
//        }
//        StringBuffer newString = new StringBuffer();
//
//        while (!stack.isEmpty()) {
//            newString.append(stack.pop());
//        }
//
//        System.out.println(newString);

//        Stack stack = new Stack();
//        stack.push(5);
//        stack.push(3);
//        System.out.println(stack.peek());
//        System.out.println(stack.pop());
//        System.out.println(stack.peek());
//        stack.push(8);

//        ArrayQueue queue = new ArrayQueue();
//        queue.enqueue(1);
//        queue.enqueue(2);
//        queue.enqueue(3);
//        queue.enqueue(4);
//        queue.enqueue(5);
//        queue.dequeue();
//        System.out.println(queue.peek());
//        System.out.println(queue);

        HashTable newHash = new HashTable();
        newHash.put(0, "test");
        newHash.put(12, "test");
        newHash.put(5, "test 5");
        newHash.put(8, "test");
        newHash.put(30, "test");

        System.out.println(newHash.get(5));
        newHash.remove(5);
        System.out.println(newHash.get(5));
    }
}