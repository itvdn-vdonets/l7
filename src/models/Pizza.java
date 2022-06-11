package models;

public class Pizza {
    private String name;
    private int price;
    private PizzaSizeEnum size;


    public Pizza(String name, int price, PizzaSizeEnum size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PizzaSizeEnum getSize() {
        return size;
    }

    public void setSize(PizzaSizeEnum size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", price=" + price +
                '}';
    }
}
