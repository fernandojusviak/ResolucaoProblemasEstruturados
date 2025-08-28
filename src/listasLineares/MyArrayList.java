package listasLineares;

import java.util.ArrayList;

public class MyArrayList<T> {
    private Object[] array;
    private int tam;

    public MyArrayList() {
        this(20);
    }

    public MyArrayList(int capacidade) {
        this.array = new Object[capacidade];
        this.tam = 0;
    }

    private void increaseCapacity() {

        int oldCapacity = array.length;
        int newCapacity = oldCapacity + (oldCapacity / 2) + 1;
        if (tam >= array.length) {
            Object[] novo = new Object[newCapacity];
            for (int i = 0; i < tam; i++){
                novo[i] = array[i];
            }
            array = novo;
        }
    }

    public void add(T t){
        increaseCapacity();
        array[tam++] = t;
    }

    public void add(int index, T t){
        if (index < 0 || index > tam){
            throw new IndexOutOfBoundsException("Índice Inválido" + index);
        }
        increaseCapacity();
        for (int i = tam; i > index; i--){
            array[i] = array[i - 1];
        }
        array[index] = t;
        tam++;
    }


    public T get(int index){
        if(index < 0 || index > tam){
            throw new IndexOutOfBoundsException();
        }
        T v = (T) array[index];
        return v;
    }

    public T set(int index, T t){
        if (index < 0 || index > tam){
            throw new IndexOutOfBoundsException();
        }
        T old = (T) array[index];
        array[index] = t;
        return old;
    }

    public int indexOf(Object o){
        if (o == null){
            for (int i = 0; i < tam; i++){
                if (array[i] == null){
                    return i;
                }
            }
        } else {
            for (int i = 0; i < tam; i++){
                if (o.equals(array[i]))
                    return i;
            }
        }
        return -1;
    }

    public boolean contains(Object o){
        return indexOf(o) >= 0;
    }

    public T remove(int index){
        if (index < 0 || index > tam){
            throw new IndexOutOfBoundsException();
        }
        T old = (T) array[index];
        for (int i = index; i < tam - 1; i++){
            array[i] = array[i + 1];
        }
        array[--tam] = null;
        return old;
    }

    public boolean remove(Object o){
        int inx = indexOf(o);
        if (inx >= 0) {
            remove(inx);
            return true;
        }
        return false;
    }

    public Object[] toArray(){
        Object[] novo = new Object[tam];
        for (int i = 0;i < tam; i++){
            novo[i] = array[i];
        }
        return novo;
    }

    public int tam() {
        return tam;
    }
}