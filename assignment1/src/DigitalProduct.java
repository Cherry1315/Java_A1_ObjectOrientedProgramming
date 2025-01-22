public abstract class DigitalProduct implements Product {
    //Instance variables
     protected String productName;
    protected double price;
    protected double customerReviews;


    //Default Constructor with no parameters
    public DigitalProduct() {
    }

    //Constructor with 3 parameters
    public DigitalProduct(String productName, double price, double customerReviews) {
        this.productName = productName;
        this.price = price;
        this.customerReviews = customerReviews;
    }


    //abstract method
    @Override
    public abstract double calculatePrice();
    //abstract method
    @Override
    public abstract void addToWishList();

    //getter
    public String getProductName() {
        return productName;
    }

    //setter
    public void setProductName(String productName) {
        this.productName = productName;
    }

    //getter
    public double getPrice() {
        return price;
    }

    //setter
    public void setPrice(double price) {
        this.price = price;
    }

    //getter
    public double getCustomerReviews() {
        return customerReviews;
    }

    //setter
    public void setCustomerReviews(double customerReviews) {
        this.customerReviews = customerReviews;
    }

    /*
    Overriding Object class via using toString() method, so we can get the String values (and manipulate them). Will print everything.
    */
    @Override
    public String toString() {
        return "Book: " + productName + "\n" + "Price: $" + price + "\n" + "Customer Reviews: " + customerReviews;
    }

    //This method prints The above method (toString).
    public static void print(DigitalProduct digitalProduct) {
        System.out.println(digitalProduct.toString());
    }

}
