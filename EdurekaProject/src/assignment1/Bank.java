package assignment1;

public class Bank 
{

    public static void main(String[] args) 
    {

        // Create a new class for a bank account
        // Create fields for the account number, balance, customer name, email and phone number.
        //
        // Create getters and setters for each field
        // Create two additional methods
        // 1. To allow the customer to deposit funds (this should increment the balance field).
        // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
        // but not allow the withdrawal to complete if their are insufficient funds.
        // You will want to create various code in the Main class (the one created by IntelliJ) to
        // confirm your code is working.
        // Add some System.out.println's in the two methods above as well.

        Account defaultAccount = new Account();
        Account NavyasAccount = new Account("12345", 0.00, "Navya Sindhu", "navya@sindhu.com", "(+91) 9876543210");

        System.out.println(NavyasAccount.getAcc_No());
        System.out.println(NavyasAccount.getBalance());

        NavyasAccount.withdraw(100.0);
        NavyasAccount.deposit(50);
        NavyasAccount.withdraw(100);
        NavyasAccount.deposit(50);
        NavyasAccount.withdraw(100);

        Account AshrisAccount = new Account("Ashritha", "ashri@mail.com", "12345");
        System.out.println(AshrisAccount.getAcc_No() + " owner: " + AshrisAccount.getcust_Name());

        
    }
}