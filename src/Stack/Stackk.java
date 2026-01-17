package Stack;

public class Stackk<E> implements Stack<E> {
    private E arr[];
    private int t=-1;
    private static final int CAPICITY=1000;

    public Stackk() {
        this(CAPICITY);

    }

    public Stackk(int c) {
        arr=(E[])new Object[c];

    }

    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    @Override
    public int size() {
        return t+1;
    }

    @Override
    public void push(E data)  {
        if(size()==arr.length)
        {
            System.out.println("stack is full");
            return ;
//            throw new IllegalStateException("stack is full");
        }
        else {
            arr[++t]=data;
        }
    }

    @Override
    public E pop() {
        if(isEmpty())  return null;
        E delete=arr[t];
        arr[t]=null;
        t--;
        return delete;
    }

    @Override
    public E top() {
        if (isEmpty())return null;
        return arr[t];
    }
    public void display(){
        for (int i=t;i>=0;i--){
            System.out.println(arr[i]);
        }

    }


}