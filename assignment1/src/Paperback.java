//    Link to product:
//    https://www.amazon.com.au/Daisy-Haites-Great-Undoing-Book/dp/1398717231/ref=tmm_pap_swatch_0?_encoding=UTF8&qid=&sr=
public class Paperback extends PhysicalProduct implements Comparable<Paperback> {
    //Instance variables
    private String language;
    private int paperbackPages;
    protected boolean isAvailable;


    //Default Constructor with no parameters
    public Paperback() {
    }

    //Constructor with 6 parameters
    public Paperback(String productName, double price, double customerReviews, String language, int paperbackPages, boolean isAvailable) {
        super(productName, price, customerReviews);
        this.language = language;
        this.paperbackPages = paperbackPages;
        this.isAvailable = isAvailable;
    }


    //Inherited from Superclass and overridden (polymorphism) for this class. Calculates 10% of the price and adds it onto the price. Aka GST/tax.
    @Override
    public double calculatePrice() {
        return price / 10 + price;
    }

    //Inherited from Superclass and overridden (polymorphism) for this class. Prints out product name and text.
    //Probably should have made it a boolean/functional with if statement... and implemented higher within the inheritance...
    @Override
    public void addToWishList() {
        System.out.println(productName + " added to wishlist.");
    }


    //getter
    public String getLanguage() {
        return language;
    }

    //setter
    public void setLanguage(String language) {
        this.language = language;
    }

    //getter
    public int getPaperbackPages() {
        return paperbackPages;
    }

    //setter
    public void setPaperbackPages(int paperbackPages) {
        this.paperbackPages = paperbackPages;
    }

    //getter
    public boolean isAvailable() {
        return isAvailable;
    }

    //setter
    public void setAvailable(boolean available) {
        isAvailable = available;
    }


    /*
    overriding Object class via using toString() method, so we can get the String values (and manipulate them). Also overriding
    the toString() in the superclass called PhysicalProduct. Aka polymorphism. This will affect/change the print()
    method in the superclass too. super.toString to make sure we are still printing the previous printout (as we don't want to change it)
    */
    @Override
    public String toString() {
        return "The Product details are:" + "\n" + super.toString() + "\n" + "Language: " + language + "\n" + "Number of Pages: " + paperbackPages + "\n" + "Item Availability: " + isAvailable;
    }

    //Comparing paperback to other paperbacks within the parameter. Sorting them from least to most expensive. If they are
    //the same price then organises alphabetically, regardless of case sensitivity.
    @Override
    public int compareTo(Paperback differentPaperback) {
        if (differentPaperback == null) {
            throw new NullPointerException();
        } else {
            if (price == differentPaperback.getPrice()) {
                return productName.compareToIgnoreCase(differentPaperback.getProductName());
            } else if (price > differentPaperback.getPrice()) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}
