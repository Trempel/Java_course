package org.levelup.lession4.homework;

public class Vine {

    private int price;
    private String name;
    private String type;

    public Vine(){
    }
    public Vine(String name, int price, String type){
        this.name = name;
        this.price = price;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vine vine = (Vine) o;
        return price == vine.price && name.equals(vine.name) && type.equals(vine.type);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = result*7 + price;
        result = result*7 + name.hashCode();
        result = result*7 + type.hashCode();
        return result;
    }

    public static void main(String[] args) {
        Vine[] vines = new Vine[]{
                new Vine("vine1", 500, "dry"),
                new Vine("vine2", 400,"sweet"),
                new Vine("vine3",300, "semisweet"),
                new Vine("vine4", 900,"adontnow"),
                new Vine("vine1", 500, "dry")
        };

        for (int i=0;i<vines.length; i++)
        {
            System.out.println("Name is " + vines[i].name + ", " + " price is " + vines[i].price + ", " + " tipe is " + vines[i].type);
            System.out.println(vines[0].equals(vines[4]));
        }

        Vine vineForHashSearch = new Vine("vine4", 900, "adontnow");
        for (int i=0; i<vines.length; i++)
        {
            if(vineForHashSearch.hashCode() == vines[i].hashCode())
            {
                System.out.println(vines[i].name);
            }
        }
    }
}
