package org.levelup.lession6.homework;

public class Deck {
    private ListElement head;
    private ListElement tail;

    public void addLast(int value) {
        ListElement element = new ListElement(value);
        if (head == null) {
            head = element;
            tail = element;
        } else {
            ListElement current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(element);
            tail = element;
        }
    }

    public void addFirst(int value)
    {
        ListElement element = new ListElement(value);
        if (head ==null)
        {
            head = element;
            tail = element;
        } else {
            ListElement current = tail;
            while (current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(element);
            head = element;
        }

    }

    public void popBack(){
        ListElement newTail = tail.getNext();
        tail = newTail;
    }
    public void popFront(){
        ListElement newHead = head.getNext();
        head = newHead;
    }

}

