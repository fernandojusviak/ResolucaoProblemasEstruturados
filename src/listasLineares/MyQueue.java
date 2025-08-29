package listasLineares;

public class MyQueue<E> {
    private MyNode<E> first;
    private MyNode<E> last;


    public MyQueue(){
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void enqueue(E e){
        MyNode<E> newNode = new MyNode<>(e);
        if (isEmpty()){
            first = newNode;
            last = newNode;
        } else{
            last.setNext(newNode);
            last = newNode;
        }
    }

    public E dequeue(){
        if (isEmpty()){
            throw new IllegalStateException("Pilha Vazia");
        }
        E value = first.getValue();
        first = first.getNext();
        if (first == null){
            last = null;
        }
        return value;
    }

    public void clear(){
        first = null;
        last = null;
    }
}
