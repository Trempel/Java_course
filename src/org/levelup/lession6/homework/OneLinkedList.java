package org.levelup.lession6.homework;


public class OneLinkedList {

    // Head - начало списка
    // Tail - конец списка
    private ListElement head;

    public void addLast(int value) {
        ListElement element = new ListElement(value);
        if (head == null) {
            // Список пустой
            head = element;
        } else {
            ListElement current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(element);
        }
    }

    public void deleteByIndex(int index){

        int index0 = 0;
        if (head.getNext()==null)
        {
            head.setValue(null);
        }else
        {
            ListElement current = head;
            while (index0<index-1) {
                current = current.getNext();
                index0++;
            }
            while (current.getNext() != null)
            {
                current.setValue(current.getNext().getValue());
                current = current.getNext();
            }
        }
    }

    public void getAll(){
        ListElement current = head;
        while (current.getNext()!=null){
            System.out.println(head);
            //System.out.println(current.getValue());
            current = current.getNext();
        }
    }
}
