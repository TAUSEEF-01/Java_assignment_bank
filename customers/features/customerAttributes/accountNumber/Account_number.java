package customers.features.customerAttributes.accountNumber;

public class Account_number {
    public String account_number;

    public Account_number()
    {
        this.account_number = "Default";
    }

    public Account_number(String a)
    {
        this.account_number = a;
    }

    public void update(String a)
    {
        this.account_number = a;
    }

    public void print()
    {
        System.out.println("Account Number: " + this.account_number);
    }
}
