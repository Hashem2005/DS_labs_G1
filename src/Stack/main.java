package Stack;

public class main {
    public static void main(String[] args) {
        //<Integer> astack=new DLinkedStack<Integer>();
        // SLinkedStack<Integer> dstack=new SLinkedStack<Integer>();



        Stackk<Integer> astack=new Stackk<Integer>(3);
        astack.push(10);
        astack.push(20);
        astack.push(30);
        astack.push(40);
        astack.display();



//        System.out.println("the top is:"+astack.top());
//        while (!astack.isEmpty()){
//            System.out.println("item removed:"+astack.pop());
//        }

    }
}