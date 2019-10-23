package org.levelup.lession6.homework;


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
    public void deleteByIndex(int index){
        if(elementData.length==size){
            int[] oldArray = elementData;
            elementData = new int[(int)(elementData.length)];
            System.arraycopy(oldArray,0,elementData,0,index);
            System.arraycopy(oldArray,index+1,elementData,index,oldArray.length-index-1);
        }
    }
    public void getAll(){

        for(int i=0;i<size;i++)
        {
            System.out.println(elementData[i]);
        }
    }
}
