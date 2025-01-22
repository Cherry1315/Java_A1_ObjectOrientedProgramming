//    Link to product:
//    https://www.amazon.com.au/Daisy-Haites-Undoing-Magnolia-Universe-ebook/dp/B0BN67X2DM/ref=tmm_kin_swatch_0?_encoding=UTF8&qid=&sr=
public class Kindle extends DigitalProduct{
    //Instance variables
    private String language;
    private int fileSizeKB;
    private boolean textToSpeech;


    //Default Constructor with no parameters
    public Kindle() {
    }

    //Constructor with 6 parameters
    public Kindle(String productName, double price, double customerReviews, String language, int fileSizeKB, boolean textToSpeech) {
        super(productName, price, customerReviews);
        this.language = language;
        this.fileSizeKB = fileSizeKB;
        this.textToSpeech = textToSpeech;
    }


    //Inherited from Superclass and overridden (polymorphism) for this class: get 10% off the price as no trees were
    // needed in making this book!
    @Override
    public double calculatePrice() {
        return price - (price / 10);
    }

    //Inherited from Superclass and overridden (polymorphism) for this class. Prints out product name and text...
    //Should have made it a boolean/functional with an if statement... and implemented higher within the inheritance...
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
    public int getFileSizeKB() {
        return fileSizeKB;
    }

    //setter
    public void setFileSizeKB(int fileSizeKB) {
        this.fileSizeKB = fileSizeKB;
    }

    //getter
    public boolean isTextToSpeech() {
        return textToSpeech;
    }

    //setter
    public void setTextToSpeech(boolean textToSpeech) {
        this.textToSpeech = textToSpeech;
    }

    /*
    overriding Object class via using toString() method, so we can get the String values (and manipulate them). Also overriding
    the toString() in the superclass called PhysicalProduct. Aka polymorphism. This will affect/change the print()
    method in the superclass too. super.toString to make sure we are still printing the previous printout (as we don't want to change it)
    */
    @Override
    public String toString() {
        return "The Product details are:" + "\n" + super.toString() + "\n" + "Language: " + language + "\n" + "File Size: " + fileSizeKB + "\n" + "Text-to-Speech: " + textToSpeech;
    }

}
