//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create an instance of Bank class with accountType 'CRISPEN' and accountBalance 230673
        Bank bankAccount = new Bank("CRISPEN", 230673);

        //Create an instance of the Insurance class to call the cover method
        Insurance insurance = new Insurance();
        insurance.cover();

        // Invoke the display method to print "Y0o are covered"
        bankAccount.display();
    }
}