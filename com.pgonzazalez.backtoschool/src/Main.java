public class Main {
    public static void main(String[] args) {
        Array array = new Array(3);
        array.insert(10);
        array.insert(20);
        array.insert(30);
        array.removeAt(0);
        array.insert(40);
        array.insert(50);
        array.removeAt(2);
        System.out.println(array.indexOf(40));
        array.print();
    }
}