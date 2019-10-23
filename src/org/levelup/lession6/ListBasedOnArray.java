package org.levelup.lession6;

public class ListBasedOnArray {

    private int[] elementData;
    private int size;

    public ListBasedOnArray(int initialCapacity){
        this.elementData = new int[initialCapacity];
    }

    public void addLast(int value){
        if(elementData.length==size){
            int[] oldArray = elementData;
            elementData = new int[(int)(elementData.length*1.5)];
            System.arraycopy(oldArray,0,elementData,0,oldArray.length);
        }
        elementData[size++] = value;
    }
}
