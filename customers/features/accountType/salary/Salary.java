package customers.features.accountType.salary;

import customers.features.money_exchange.moneySendToAccount.BkashToAcc.Bkash_to_acc;
import customers.features.money_exchange.moneySendToAccount.EFT.Eft;
import customers.features.money_exchange.moneySendToAccount.recipt.Recipt;
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

    public Salary(double n)
    {
        
        this.initial_amount = n;
        interest = new Interest();
        flag = 0;
        this.amount = n;

        days = 0;
        rate = .02;
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


    public void add(double n, Bkash_to_acc bk)
    {
        if(bk.addMoney_bankAcc(n) == true)
        this.amount += n;
        else 
        this.amount += 0;
    }


    public void add(double n, Eft eft)
    {
        if(eft.addMoney_bankAcc(n) == true)
        this.amount += n;
        else 
        this.amount += 0;
    }


    public void add(double n, Recipt rcpt)
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
