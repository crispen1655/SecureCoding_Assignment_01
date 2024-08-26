public class Bank {
    // Fields to store account type and balance
    private final String accountType;
    private final double accountBalance;

    // Parameterized constructor to set account type and balance
    public Bank(String accountType, double accountBalance) {
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    // Method to display account details
    public void display() {
        System.out.println("The account type is " + accountType + " and the balance is " + accountBalance);
    }
}