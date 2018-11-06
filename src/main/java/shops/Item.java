package shops;

public class Item {
    private String name;
    private double price;

    protected Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " - " + price;
    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


}
