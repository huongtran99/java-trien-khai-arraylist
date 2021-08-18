package com.codegym;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public Object[] getElements() {
        return elements;
    }

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        if (capacity > 0) {
            this.elements = new Object[capacity];
        } else
            System.out.println("Fail");
    }

    private void ensureCapacity() {
        if (size == elements.length) {
            int newSize = elements.length + 1;
            elements = Arrays.copyOf(elements, newSize);
        }
    }

    public void addElementIndex(int index, E element) {
        ensureCapacity();
        Object[] newElements = new Object[elements.length + 1];
        for (int i = size; i < newElements.length; i++) {
            if (i < index) {
                newElements[i] = elements[i];
            } else if (i == index) {
                newElements[i] = element;
                size++;
            } else {
                newElements[i] = elements[i - 1];
            }
        }
        elements = newElements;
    }

    public void add(E element) {
        ensureCapacity();
        elements[size++] = element;
    }

    public E remove(int index) {
        E oldValue = (E) elements[index];
        Object[] newElements = new Object[elements.length - 1];
        for (int i = 0; i < newElements.length; i++) {
            if (i < index) {
                newElements[i] = elements[i];
            } else {
                newElements[i] = elements[i + 1];
            }
        }
        size--;
        elements = newElements;
        return oldValue;
    }

    public void clear() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(elements[i]))
                return true;
        }
        return false;
    }

    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(elements[i]))
                return i;
        }
        return -1;
    }

    public int size() {
        return size;
    }

    public E get(int i) {
        return (E) elements[i];
    }
}
