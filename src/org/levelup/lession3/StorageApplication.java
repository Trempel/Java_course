package org.levelup.lession3;

public class StorageApplication {

    public static void main(String[] args) {
        Storage storage = new Storage(100);

        storage.add("Fignya1",100.001);

        Product newProduct = new Product();
        newProduct.name = "Pyschnya1";
        newProduct.weight = 1353135.11;
        newProduct.setupCount(4);

        storage.addProduct(newProduct);


        Product alptop = new Product();
        alptop.name = "Pyschnya1";
        alptop.weight = 1353135.11;
        alptop.setupCount(2);

    }
}
