package customers.features.customerAttributes.phoneNumber;

public class Phone_number {
    public String phoneNumber;

    public Phone_number()
    {
        this.phoneNumber = "Default";
    }

    public Phone_number(String a)
    {
        this.phoneNumber = a;
    }

    public void update(String a)
    {
        this.phoneNumber = a;
    }

    public void print()
    {
        System.out.println("Phone Number: " + this.phoneNumber);
    }
}
