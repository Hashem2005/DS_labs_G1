package SingleLinkedList;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList<Integer>list=new SingleLinkedList<Integer>();
        SingleLinkedList<String> list2=new SingleLinkedList<String>();

        list.addLast(10);
        list.addLast(40);
        list.addfirsr(20);
        list.addLast(30);
        list.removeFirst();
        list.removeLast();
        list.display();

    }
}
