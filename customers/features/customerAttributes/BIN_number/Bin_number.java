package customers.features.customerAttributes.BIN_number;

public class Bin_number {
    public String BIN_number;
    
    public Bin_number()
    {
        this.BIN_number = "Default";
    }

    public Bin_number(String a)
    {
        this.BIN_number = a;
    }

    public void update(String a)
    {
        this.BIN_number = a;
    }

    public void print()
    {
        System.out.println(this.BIN_number);
    }
}
