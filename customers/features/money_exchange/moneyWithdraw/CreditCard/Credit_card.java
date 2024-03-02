package customers.features.money_exchange.moneyWithdraw.CreditCard;

import customers.features.accountType.salary.Salary;
import customers.features.accountType.savings.Savings;

public class Credit_card {
    public double amount;
    public Savings savings;
    public Salary salary;


    public Credit_card(Savings sv)
    {
        savings = sv;
        salary = null;
    }

    public Credit_card(Salary sr)
    {
        salary = sr;
        savings = null;
    }

    public Credit_card(Salary sr, Savings sv)
    {
        savings = sv;
        salary = sr;
    }

    public void cashout(double n)
    {
        if(savings == null)
        {
            // System.out.println("1");
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
            // System.out.println("2");
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
            // System.out.println("3");
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
