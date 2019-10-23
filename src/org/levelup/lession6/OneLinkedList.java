package org.levelup.lession6;

public class OneLinkedList {

    private ListElement head;

    public void addLast(int value){
        ListElement element = new ListElement(value);

        if (head==null){
            head = element;
        }else
        {
            ListElement current = head;
            while (current.getNext()!=null){
                current = current.getNext();
            }
            current.setNext(element);
        }
    }
}
