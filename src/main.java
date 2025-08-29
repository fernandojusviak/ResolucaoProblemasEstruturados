import listasLineares.MyStack;
import listasLineares.MyQueue;


public class main {

    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();

        stack.push(10);
        stack.push(15);
        stack.push(30);

        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.isEmpty());
        stack.clear();
        System.out.println(stack.isEmpty());

        System.out.println("---------------------------------------------------------");

        MyQueue<Integer> queue = new MyQueue<>();

        System.out.println("Fila vazia? " + queue.isEmpty());

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Fila vazia? " + queue.isEmpty());

        System.out.println("Saiu: " + queue.dequeue());
        System.out.println("Saiu: " + queue.dequeue());

        queue.enqueue(40);
        queue.enqueue(50);

        System.out.println("Saiu: " + queue.dequeue());
        System.out.println("Saiu: " + queue.dequeue());
        System.out.println("Saiu: " + queue.dequeue());

        System.out.println("Fila vazia? " + queue.isEmpty());
    }

}
