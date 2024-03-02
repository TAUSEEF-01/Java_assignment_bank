package customers.features.accountType.salary;

import customers.features.scheme.interest.Interest;

public class Salary {
    public double initial_amount;
    public double amount, rate;
    public int days, flag;
    public Interest interest; 

    public Salary()
    {
        initial_amount = 0;
        amount = 0;
        days = 0;
        flag = 1;
        rate = .025;
    }

    public void update(double n)
    {
        if(flag == 1)
        {
            this.initial_amount = n;
            interest = new Interest();
            flag = 0;
        }

        this.amount = n;
    }

    public void timeUpdate(int t)
    {
        days += t;
        // double current = initialBalance();
        // current += ((days * 1.0) / 365.0) * .025 * current;
        // update(current);

        // update(interest.totalVal(initialBalance(), rate, days));
        update(interest.totalVal(balance(), rate, t));
    }

    public int totalDays()
    {
        return this.days;
    }

    public void add(double n)
    {
        this.amount += n;
    }

    public double initialBalance()
    {
        return this.initial_amount;
    }

    public double balance()
    {
        return this.amount;
    }

    public void print()
    {
        System.out.println(this.amount);
    }
}
