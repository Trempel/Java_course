package org.levelup.lession3;

public class Storage {

    private Product[] products;

    Storage(){
        products = new Product[10];
    }

    public Storage(int lenth) {
        products = new Product[lenth];
    }

    public void add(String name, double weight){
        Product newProduct = new Product();
        newProduct.name = name;
        newProduct.weight = weight;
        int index = findIndex();
        if (index != products.length){
            products[index] = newProduct;
        }
    }

    public void addProduct(Product newProduct){
        int index = findIndex();
        if (index != products.length){
            products[index] = newProduct;
        }
    }

    private int findIndex(){
        for (int i=0;i<products.length;i++){
            if(products[i] ==null){
                return i;
            }
        }
        return products.length;
    }
}
