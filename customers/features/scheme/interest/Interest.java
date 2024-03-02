package customers.features.scheme.interest;

public class Interest {
    
    public double totalVal(double initialBalance, double rate, int days)
    {
        double current = initialBalance;
        current += ((days * 1.0) / 365.0) * rate * current;

        return current;
    }
}
