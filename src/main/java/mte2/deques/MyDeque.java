// Question: Q2 (mte2, gcis124, 2255)
// Package name: deques
// File name: MyDeque.java

package mte2.deques;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.*;
public class MyDeque<E> implements Deque<E> {
    
    private final LinkedList<E> list;
    public MyDeque() {list = new LinkedList<>();    }

    public void enqueueFront(E element) {
        list.add(0, element);

    } 

    public void enqueueBack(E element) {
        list.add(list.size(), element);

    }

    public E dequeueFront() {
        list.remove(0);
        return list.get(0);
    }

    public E dequeueBack() {
        E last = list.get(list.size());
        list.remove(list.size());
        return last;
    } 

    public int size() {
        return list.size();
    }

    public Iterator<E> iterator() {

        public E next() {
            E head = 0;
            E next = head +1;
            return head;
        }
        public boolean hasNext() {
            return list.size() > list.index();
        }

    }

    public static void main(String[] args) { 
        MyDeque list = new MyDeque<>();
        list.enqueueFront("One");
        list.enqueueBack("Apple");
        System.out.println(list.size());
        
        
    }
}