package org.levelup.lession6.homework;

public class Queue {

    private int[] elements;
    private int size;

    public Queue (int initialCapacity) {
        this.elements = new int[initialCapacity];
    }

    public boolean addLast(int value){
        if(elements.length==size){
            return false;
        }
        elements[size++] = value;
        return true;
    }

    public void dequeue(){
        if(elements.length==0)
        {
            System.out.println("Empty");
        }
        else{
            for(int i=0;i<elements.length;i++){
                if(elements[i]!=0){
                    elements[i]=0;
                    break;
                }
            }
        }
    }

    public void getAll(){
        for(int i=0;i<size;i++)
        {
            System.out.println(elements[i]);
        }
    }
}
