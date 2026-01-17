package Stack;

import SingleLinkedList.SingleLinkedList;

public class SLinkedStack<E> implements Stack<E> {
    SingleLinkedList<E> sList=new SingleLinkedList<E>();
    @Override
    public boolean isEmpty() {
        return sList.isEmpty();
    }

    @Override
    public int size() {
        return sList.size();
    }

    @Override
    public void push(E data) {
        sList.addfirsr(data);
    }


    @Override
    public E pop() {
        return sList.removeFirst();
    }

    @Override
    public E top() {
        return sList.getFirst();
    }
}