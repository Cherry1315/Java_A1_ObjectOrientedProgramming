public abstract class PhysicalProduct implements Product {
    //Instance variables
    protected String productName;
    protected double price;
    protected double customerReviews;


    //Default Constructor with no parameters
    public PhysicalProduct() {
    }

    //Constructor with 3 parameters
    public PhysicalProduct(String productName, double price, double customerReviews) {
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

    //Using polymorphism with Object class. Prints all details
    @Override
    public String toString() {
        return "Book: " + productName + "\n" + "Price: $" + price + "\n" + "Customer Reviews: " + customerReviews;
    }

    //This method prints The above method (toString).
    public static void print(PhysicalProduct physicalProduct) {
        System.out.println(physicalProduct.toString());
    }
}
