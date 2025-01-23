import java.util.ArrayList;
import java.util.function.Predicate;

public class AssignmentOne {
    public static void main(String[] args) {

        // Part 2 - Using abstract classes and interfaces
        // creating 2 objects from my concrete classes.
        Paperback book1 = new Paperback("Under A Sea Of Stars", 29.99, 4.8, "English", 301, false);
        Kindle vBook1 = new Kindle("Interview with the Vampire", 16.00, 4.3, "English", 1200, true);

        System.out.println("-----------------------");

        // Part 3 - Polymorphism
        /*
         * showing polymorphism here. Polymorphism is seen with inheritance -- you have
         * a superclass and potentially many child
         * classes. Inheritance lets attributes get passed down, and polymorphism allows
         * us to change/modify these passed down
         * attributes in the child classes. This is seen with the
         * demonstratePolymorphism() method. The method demonstratePolymorphism()
         * can pass any product to it due to the parameter (and since every product has
         * a calculatePrice() method, we see when
         * this method is called in main that we get different outcomes. The different
         * outcomes is due to the child classes
         * having different calculations)... hence polymorphism.
         */
        demonstratePolymorphism(book1);
        demonstratePolymorphism(vBook1);

        System.out.println("-----------------------");

        // Part 4 - Generic interfaces
        // declaring and initialising an ArrayList with 5 objects.
        ArrayList<Paperback> paperbackArray = new ArrayList();
        paperbackArray.add(new Paperback("Sweep", 26.00, 4.6, "English", 297, true));
        paperbackArray.add(new Paperback("harry Potter", 30.00, 3.9, "Spanish", 394, true));
        paperbackArray.add(new Paperback("Memoirs Of A Geisha", 18.70, 5.0, "English", 297, true));
        paperbackArray.add(new Paperback("Normal", 27.56, 3.7, "English", 297, false));
        paperbackArray.add(new Paperback("The Books of Abarat", 30.00, 3.9, "Japanese", 400, false));

        System.out.println("-----------------------");

        // Part 5 - Generic methods
        // Makes the ArrayList stop sorting from its natural sorting style and therefore
        // allows us to sort our ArrayList from our compareTo method in Paperback.
        paperbackArray.sort(null);
        // sorts (using compareTo method in Paperback) and prints out the ArrayList
        // called paperbackArray. Prints it out.
        for (Paperback paperbacks : paperbackArray) {
            PhysicalProduct.print(paperbacks);
        }

        System.out.println("-----------------------");

        // Part 6 - Wildcards
        // calling the method called demonstrateWildCards(), and getting the value from
        // my ArrayList called paperbackArray. (Pretty sure I have done this section
        // wrong.)
        demonstrateWildCards(paperbackArray);

        System.out.println("-----------------------");

        // Part 7 - Simple lambda expressions
        /*
         * Calling the method called DemonstrateLambdas() and checking what is true or
         * false regarding our ArrayList called PaperbackArray.
         * 'book' is the parameters and 'book.isAvailable...' is the body.
         * '->' is the separator of these two things -- it is an expression.
         */
        demonstrateLambdas(book -> book.isAvailable() == false, paperbackArray);

        System.out.println("-----------------------");
    }

    // Method for Part 3 - Polymorphism
    public static void demonstratePolymorphism(Product product) {
        System.out.println("The price of the book is now: $" + product.calculatePrice());
    }

    // Method for Part 6 - Wildcards
    /*
     * Have an ArrayList generic as the parameter (question mark represents an
     * unknown value type). Using a wildcard
     * with an upper bound (extends) to get any list type of Object (PhyicalProduct
     * class). We then return objects value at index 3
     * (method within PhyicalProduct called calculatePrice. Should therefor return a
     * price with 10% added to it.)
     */
    public static double demonstrateWildCards(ArrayList<? extends PhysicalProduct> wildArray) {
        return wildArray.get(3).calculatePrice();
        // return wildArray.get(0).calculatePrice();
    }

    // Method for Part 7 - lambdas
    // Lambda expressions are chunks of code that can be randomly placed in the body
    // of a method
    // Getting what books are unavailable (boolean) and prints out saying what these
    // objects (names only) are.
    // Note: This method takes 2 things Predicate (interface) and ArrayList (called
    // books) with type Paperback. (Method uses generics -- type.)
    public static void demonstrateLambdas(Predicate<Paperback> isAvailable, ArrayList<Paperback> books) {
        for (Paperback book : books) {
            if (isAvailable.test(book)) {
                System.out.println("Unavailable books: " + book.getProductName());
            }
        }
    }
}
