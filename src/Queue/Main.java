package Queue;

public class Main {
    public static void main(String[] args) {
        DlinkedQueue<Integer> lqueue=new DlinkedQueue<Integer>();
        lqueue.enqueue(10);
        lqueue.enqueue(20);
        lqueue.enqueue(30);
        lqueue.enqueue(40);
        System.out.println("front is: "+lqueue.front());
        while (!lqueue.isEmpty()){
            System.out.println("element removed: "+lqueue.dequeue());
        }


    }


}