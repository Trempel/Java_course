package org.levelup.lession6.homework;

//import org.levelup.lession3.Product;
//import org.levelup.lession6.ListBasedOnArray;
//import org.levelup.lession6.ListElement;
//import org.levelup.lession6.OneLinkedList;

import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
//        ListBasedOnArray list = new ListBasedOnArray(5);
//        list.addLast(40);
//        list.addLast(60);
//        list.addLast(10);
//        list.addLast(90);
//        list.addLast(20);
//        list.addLast(-10);
//        list.addLast(40);
//
//        ListElement<String> stringListElement = new ListElement<>("");
//        //ListElement<Product> productListElement = new ListElement<>(null);
//
//        OneLinkedList linkedList = new OneLinkedList();
//        linkedList.addLast(10);
//        linkedList.addLast(100);
//        linkedList.addLast(1000);
//        linkedList.addLast(10000);
//        linkedList.addLast(100000);
//        linkedList.addLast(1000000);

//        Deck deck = new Deck();
//
////        deck.addLast(1);
////        deck.addLast(10);
////        deck.addLast(100);
////        deck.addLast(1000);
//
//        deck.addFirst(1);
//        deck.addLast(2);
//        deck.addFirst(10);
//        deck.addLast(20);
//        deck.addFirst(100);
//        deck.addLast(200);
//        deck.addFirst(1000);
//        deck.addLast(2000);
//        deck.addFirst(10000);


        Queue queue = new Queue(5);
        queue.addLast(10);
        queue.addLast(10);
        queue.addLast(10);
        queue.addLast(10);
        queue.addLast(10);
        queue.addLast(10);

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.getAll();

        //linkedList.deleteByIndex(3);
//        System.out.println("++++++++++");
//        linkedList.getAll();
        //list.deleteByIndex(5);

//        linkedList.getAll();

//list.deleteByIndex(5);
//list.getAll();

    }
}
