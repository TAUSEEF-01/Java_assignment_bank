package customers.features.customerAttributes.email;

public class Email {
    public String email;

    public Email()
    {
        this.email = "Default";
    }

    public Email(String a)
    {
        this.email = a;
    }

    public void update(String a)
    {
        this.email = a;
    }

    public void print()
    {
        System.out.println(this.email);
    }
}
