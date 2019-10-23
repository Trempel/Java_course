package org.levelup.lession4;

public class Cat extends Animal {
    void tygydyck(){
        System.out.println("TYGYDYCK");
    }
    Cat(){
        System.out.println("Йа конструктор KOTA...");
    }
    void eat(){
        super.eat();
        System.out.println("Кысанька питаеца...");
    }
}
