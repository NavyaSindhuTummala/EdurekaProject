package assignment1;

public class Account 
{
    private String Acc_No;
    private double balance;
    private String cust_Name;
    private String cust_Email;
    private String cust_Phone;

    public Account() 
    {
        this("XXXXXXXXX", 0.00, "Default name", "Default email", "Default phone");
        System.out.println("Default constructor.");
    }

    public Account(String Acc_No, double balance, String cust_Name, String cust_Email, String cust_Phone) 
    {
        this.Acc_No = Acc_No;
        this.balance = balance;
        this.cust_Name = cust_Name;
        this.cust_Email = cust_Email;
        this.cust_Phone = cust_Phone;
        System.out.println("AC with parameters:");
    }

    public Account(String cust_Name, String cust_Email, String cust_Phone) 
    {
        this("XXXXXXXXX", 0.00, cust_Name, cust_Email, cust_Phone);
    }

    public String getAcc_No() 
    {
        return Acc_No;
    }

    public void setAcc_No(String Acc_No) 
    {
        this.Acc_No = Acc_No;
    }

    public double getBalance() 
    {
        return balance;
    }

    public void setBalance(double balance) 
    {
        this.balance = balance;
    }

    public String getcust_Name() 
    {
        return cust_Name;
    }

    public void setcust_Name(String cust_Name) 
    {
        this.cust_Name = cust_Name;
    }

    public String getcust_Email() 
    {
        return cust_Email;
    }

    public void setcust_Email(String cust_Email) 
    {
        this.cust_Email = cust_Email;
    }

    public String getcust_Phone() 
    {
        return cust_Phone;
    }

    public void setcust_Phone(String cust_Phone) 
    {
        this.cust_Phone = cust_Phone;
    }

    public void deposit(double depositAmount) 
    {
        this.balance += depositAmount;
        System.out.println("OK. Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdraw(double withdrawAmount) 
    {
        if (this.balance - withdrawAmount < 0) 
        {
            System.out.println("Operation not possible.");
        } else 
        {
            this.balance -= withdrawAmount;
            System.out.println("OK. Remaining balance is " + this.balance);
        }
    }
}
