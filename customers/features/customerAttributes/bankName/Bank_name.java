package customers.features.customerAttributes.bankName;

public class Bank_name {
    public String bank_name;

    public Bank_name()
    {
        this.bank_name = "Default";
    }

    public Bank_name(String a)
    {
        this.bank_name = a;
    }

    public void update(String a)
    {
        this.bank_name = a;
    }

    public void print()
    {
        System.out.println(this.bank_name);
    }
}
