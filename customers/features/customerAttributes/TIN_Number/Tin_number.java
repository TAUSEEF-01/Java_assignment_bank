package customers.features.customerAttributes.TIN_Number;

public class Tin_number {
    public String TIN_number;

    public Tin_number()
    {
        this.TIN_number = "Default";
    }

    public Tin_number(String a)
    {
        this.TIN_number = a;
    }

    public void update(String a)
    {
        this.TIN_number = a;
    }

    public void print()
    {
        System.out.println(this.TIN_number);
    }
}
