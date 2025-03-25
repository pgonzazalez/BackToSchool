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
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(5);
        ll.addFirst(8);
        ll.addFirst(10);
        ll.deleteFirst();
        System.out.println(ll.contains(2));
        System.out.println(ll.contains(40));
        System.out.println(ll.indexOf(8));
        System.out.println(ll.indexOf(24));
        ll.addLast(50);
        ll.addFirst(0);
        ll.removeLast();
        ll.print();
    }
}