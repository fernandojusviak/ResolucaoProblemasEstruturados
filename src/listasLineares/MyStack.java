package listasLineares;

public class MyStack<E> {
    private MyNode<E> top;


    public MyStack(){
        this.top = null;
    }


    public void push(E e){
        MyNode<E> newNode = new MyNode<>(e);
        newNode.setNext(top);
        top = newNode;
    }

    public E pop(){
        if (isEmpty()){
            throw new IllegalStateException("Pilha Vazia");
        }
        E value = top.getValue();
        top = top.getNext();
        return value;
    }

    public void clear(){
        top = null;
    }

    public boolean isEmpty(){
        return top == null;
    }
}
