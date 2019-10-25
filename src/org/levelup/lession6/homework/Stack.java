package org.levelup.lession6.homework;

public class Stack {
    private int[] elementData;
    private int size;

    public Stack(int size) {
        this.elementData = new int[size];
    }

    public void addLast(int value){
        if(elementData.length==size){
            System.out.println("Stack overflow");
        }else{
        elementData[size++] = value;
        }
    }

    public void pop(){
        if(elementData.length==0)
        {
            System.out.println("Stack is empty");
        }else{
            elementData[--size]  = 0;
        }
    }
    public void getAll(){
        for (int i=0; i<size;i++)
        {
            System.out.println(elementData[i]);
        }
    }

}
