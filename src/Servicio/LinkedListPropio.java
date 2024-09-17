package Servicio;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedListPropio<T> implements Iterable<T>  {
    private Nodo<T> cabeza;
    private Nodo<T> cola;

    private static class Nodo<T> {
        T data;
        Nodo<T> next;

        public Nodo(T data) {
            this.data = data;
        }
    }

    public void add(T data) {
        Nodo<T> nuevoNodo = new Nodo<>(data);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            cola.next = nuevoNodo;
            cola = nuevoNodo;
        }
    }

    public T get(int index) {
        Nodo<T> actual = cabeza;
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = 0; i < index; i++) {
            if (actual == null) {
                throw new IndexOutOfBoundsException();
            }
            actual = actual.next;
        }
        if (actual == null) {
            throw new IndexOutOfBoundsException();
        }
        return actual.data;
    }

    public void remove(int index) {
        if (cabeza == null) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            cabeza = cabeza.next;
        } else {
            Nodo<T> actual = cabeza;
            for (int i = 0; i < index - 1; i++) {
                if (actual == null) {
                    throw new IndexOutOfBoundsException();
                }
                actual = actual.next;
            }
            if (actual == null || actual.next == null) {
                throw new IndexOutOfBoundsException();
            }
            actual.next = actual.next.next;
        }
    }

    public int size() {
        int size = 0;
        Nodo<T> actual = cabeza;
        while (actual != null) {
            size++;
            actual = actual.next;
        }
        return size;
    }

    public boolean isEmpty() {
        return cabeza == null;
    }

    public void clear() {
        cabeza = null;
        cola = null;
    }

    public boolean contains(T data) {
        Nodo<T> actual = cabeza;
        while (actual != null) {
            if (actual.data.equals(data)) {
                return true;
            }
            actual = actual.next;
        }
        return false;
    }



    @Override
    public Iterator<T> iterator() {
        return new IteradorCustom<>(cabeza);
    }

    private static class IteradorCustom<T> implements Iterator<T> {
        private Nodo<T> actual;

        public IteradorCustom(Nodo<T> cabeza) {
            actual = cabeza;
        }

        @Override
        public boolean hasNext() {
            return actual != null;
        }

        @Override
        public T next() {
            if (actual == null) {
                throw new NoSuchElementException();
            }
            T data = actual.data;
            actual = actual.next;
            return data;
        }
    }
}
