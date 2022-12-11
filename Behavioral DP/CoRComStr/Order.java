package CoRComStr;

public class Order {

    private double price;
    private String Address;
    private String product;

    public Order(double price,String Address, String product){
        this.price = price;
        this.Address = Address;
        this.product = product;
    }

    public String getAddress() {
        return Address;
    }

    public double getPrice(){
        return price;
    }
}
