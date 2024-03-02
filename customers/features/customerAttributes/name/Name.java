package customers.features.customerAttributes.name;

public class Name {
    public String name;

    public Name()
    {
        this.name = "Default";
    }

    public Name(String a)
    {
        this.name = a;
    }

    public void update(String a)
    {
        this.name = a;
    }

    public void print()
    {
        System.out.println("Name: " + this.name);
    }
}
