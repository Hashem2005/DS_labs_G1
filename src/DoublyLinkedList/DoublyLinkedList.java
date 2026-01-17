package DoublyLinkedList;

public class DoublyLinkedList<E> {
private Node<E>head;
private Node<E>tail;
private int size=0;

public DoublyLinkedList(){
    head=new Node(null,null,null);
    tail=new Node<E>(head,null,null);
    head.setNext(tail);

}

    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return  size==0;
    }

private void addBetween(Node<E>left,E Data,Node<E>right){
    Node<E>newNode=new Node<>(left,Data,right);
    left.setNext(newNode);
    right.setPrev(newNode);
    size++;
}

public void addFirst(E Data){
    addBetween(head,Data,head.getNext());
}

public void addLast(E Data){
        addBetween(tail.getPrev(),Data,tail);
    }

public E getFirst(){
  return head.getNext().getData();
}

public E getlast(){
        return tail.getPrev().getData();
    }

    private E remove(Node<E> deletedNode){
        if (isEmpty())return null;
        E delete =deletedNode.getData();
        Node<E> left=deletedNode.getPrev();
        Node<E>right=deletedNode.getNext();
        left.setNext(right);
        right.setPrev(left);
        size--;
        return delete;
    }
    public E removeFirst(){
        return remove(head.getNext());
    }
    public E removeLast(){
        return remove(tail.getPrev());
    }
    public void display(){
        if (isEmpty()){
            System.out.println("List is empty");
            return;
        }
        Node<E> temp=head.getNext();
        System.out.print("null<---head<--->");
        while (temp!=tail){
            System.out.print(temp.getData()+"<--->");
            temp=temp.getNext();
        }     System.out.println("tail--->null");



    }

    class Node<E>{
    private Node<E> prev;
    private E Data;
    private Node<E>Next;





    public Node(Node<E> prev, E data, Node<E> next) {
        this.prev = prev;
        Data = data;
        Next = next;
    }

    public Node<E> getPrev() {
        return prev;
    }

    public void setPrev(Node<E> prev) {
        this.prev = prev;
    }

    public E getData() {
        return Data;
    }

    public void setData(E data) {
        Data = data;
    }

    public Node<E> getNext() {
        return Next;
    }

    public void setNext(Node<E> next) {
        Next = next;
    }
}
}

