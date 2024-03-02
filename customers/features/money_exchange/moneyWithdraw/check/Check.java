package customers.features.money_exchange.moneyWithdraw.check;

import customers.features.accountType.salary.Salary;
import customers.features.accountType.savings.Savings;

public class Check {
    public double amount;
    public Savings savings;
    public Salary salary;


    public Check(Savings sv)
    {
        savings = sv;
        salary = null;
    }

    public Check(Salary sr)
    {
        salary = sr;
        savings = null;
    }

    public Check(Salary sr, Savings sv)
    {
        savings = sv;
        salary = sr;
    }

    public void cashout(double n)
    {
        if(savings == null)
        {
            if(salary.balance() >= n)
            {
                salary.update(salary.balance() - n);
            }
            else
            {
                System.out.println("Not enough balance!");
            }
        }
        else if(salary == null)
        {
            if(savings.balance() >= n)
            {
                savings.update(savings.balance() - n);
            }
            else
            {
                System.out.println("Not enough balance!");
            }
        }
        else
        {
            if(salary.balance() >= n)
            {
                salary.update(salary.balance() - n);
            }
            else if(savings.balance() >= n)
            {
                savings.update(savings.balance() - n);
            }
            else
            {
                System.out.println("Not enough balance!");
            }
        }
    }
}
