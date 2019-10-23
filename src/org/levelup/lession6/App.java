package org.levelup.lession6;

import org.levelup.lession3.Product;

public class App {
    public static void main(String[] args) {
        ListBasedOnArray list = new ListBasedOnArray(5);
        list.addLast(4);
        list.addLast(6);
        list.addLast(1);
        list.addLast(9);
        list.addLast(2);
        list.addLast(-1);
        list.addLast(4);

        ListElement<String> stringListElement = new ListElement<>("");
        ListElement<Product> productListElement = new ListElement<>(null);

        OneLinkedList linkedList = new OneLinkedList();
        linkedList.addLast(10);
        linkedList.addLast(100);
        linkedList.addLast(1000);
        linkedList.addLast(10000);
        linkedList.addLast(100000);
        linkedList.addLast(1000000);

    }
}
