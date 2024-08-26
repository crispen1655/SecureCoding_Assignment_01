public class Insurance extends Bank {
    // Constructor for Insurance class
    public Insurance() {
        super("CRISPEN", 230673); // Call the constructor of Bank class
    }

    // Method to print a coverage message
    public void cover() {
        System.out.println("You are covered");
    }
}