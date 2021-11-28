package gasStation;

public class Petrol {

    private String name;
    private double price;

    public Petrol(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Petrol() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "gasStation.Petrol{" +
                "name -> '" + name + '\'' +
                ", price ->" + price +
                '}';
    }
}
