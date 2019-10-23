package org.levelup.lession6;

public class ListElement<TYPE> {

    private TYPE value;
    private ListElement next;

    public ListElement(TYPE value){
        this.value = value;
    }

    public void setValue(TYPE value) {
        this.value = value;
    }

    public void setNext(ListElement next) {
        this.next = next;
    }

    public TYPE getValue() {
        return value;
    }

    public ListElement getNext() {
        return next;
    }
}
