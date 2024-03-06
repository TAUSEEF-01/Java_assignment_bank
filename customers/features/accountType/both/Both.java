package customers.features.accountType.both;

import customers.features.accountType.salary.Salary;
import customers.features.accountType.savings.Savings;

public class Both {
    public Salary salary;
    public Savings savings;

    public Both()
    {
        salary = new Salary();
        savings = new Savings();
    }

    // public Both(double n)
    // {
    //     salary = new Salary(n);
    //     savings = new Savings(n);
    // }

    // public Both(double n, double m)
    // {
    //     salary = new Salary(n);
    //     savings = new Savings(m);
    // }


    public void update(double n, double m)
    {
        // salary = new Salary(n);
        // savings = new Savings(m);
        salary.update(n);
        savings.update(m);
    }

    public void timeUpdate(int t)
    {
        salary.timeUpdate(t);
        savings.timeUpdate(t);
    }


    public double balance()
    {
        return salary.balance() + savings.balance();
    }

    public void print()
    {
        System.out.println("Salary balance: " + salary.balance());
        System.out.println("Savings balance: " + savings.balance());
    }
}
