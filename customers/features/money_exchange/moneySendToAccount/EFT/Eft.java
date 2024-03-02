package customers.features.money_exchange.moneySendToAccount.EFT;

import customers.features.accountType.salary.Salary;
import customers.features.accountType.savings.Savings;

public class Eft {
    public double amount;
    // Salary salary;
    // Savings savings;

    public Eft()
    {
        amount = 0;
    }


    public Eft(double money)
    {
        amount = money;
    }

    
    // public Eft(Salary sr)
    // {
    //     amount = 0;
    //     salary = sr;
    // }

    // public Eft(Savings sv)
    // {
    //     amount = 0;
    //     savings = sv;
    // }

    // public Eft(Salary sr, Savings sv)
    // {
    //     amount = 0;
    //     salary = sr;
    //     savings = sv;
    // }

    public void eft_balance(double money)
    {
        amount = money;
    }


    public boolean addMoney_bankAcc(double money)
    {
        if(money <= amount)
        {
            amount -= money;
            return true;
        }
        else
        {
            System.out.println("Not enough balance in your account!");
            return false;
        }
    }

    public void addMoney_bankAcc(double money, Salary sr)
    {
        if(money <= amount)
        {
            sr.add(money);
            amount -= money;
        }
        else
        {
            System.out.println("Not enough balance in your account!");
        }
    }

    public void addMoney_bankAcc(double money, Savings sv)
    {
        if(money <= amount)
        {
            sv.add(money);
            amount -= money;
        }
        else
        {
            System.out.println("Not enough balance in your account!");
        }
    }

    public void Eft_balance_addMoney(double money)
    {
        amount += money;
    }

    public void print_balance()
    {
        System.out.println(amount);
    }
}
