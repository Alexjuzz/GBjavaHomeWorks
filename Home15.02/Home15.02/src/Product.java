public class Product {
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product(String name, double price) {
        this.setName(name);
        this.setPrice(price);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString(){
        return  this.name + " по цене: " + this.price;
    }
}
