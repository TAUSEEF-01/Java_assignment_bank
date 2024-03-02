package customers.features.money_exchange.moneySendToAccount.BkashToAcc;

import customers.features.accountType.salary.Salary;
import customers.features.accountType.savings.Savings;

public class Bkash_to_acc {
    public double amount;
    // Salary salary;
    // Savings savings;

    public Bkash_to_acc()
    {
        amount = 0;
    }

    public Bkash_to_acc(double money)
    {
        amount = money;
    }

    // public Bkash_to_acc(Salary sr)
    // {
    //     amount = 0;
    //     salary = sr;
    // }

    // public Bkash_to_acc(Savings sv)
    // {
    //     amount = 0;
    //     savings = sv;
    // }

    // public Bkash_to_acc(Salary sr, Savings sv)
    // {
    //     amount = 0;
    //     salary = sr;
    //     savings = sv;
    // }

    public void bkashWallet(double money)
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

    public void bakashWallet_addMoney(double money)
    {
        amount += money;
    }

    public void print_balance()
    {
        System.out.println("Bkash Balance: " + amount);
    }
}
