package customers.features.money_exchange.moneyWithdraw.AccToBkashWallet;

import customers.features.accountType.both.Both;
import customers.features.accountType.salary.Salary;
import customers.features.accountType.savings.Savings;
import customers.features.money_exchange.moneySendToAccount.BkashToAcc.Bkash_to_acc;

public class Acc_to_bkash_wallet {
    public double amount;
    public Savings savings;
    public Salary salary;

    // public Acc_to_bkash_wallet()
    // {
    //     amount = 0;
    // }

    // public Acc_to_bkash_wallet(Savings sv)
    // {
    //     savings = sv;
    // }

    // public Acc_to_bkash_wallet(Salary sr)
    // {
    //     salary = sr;
    // }

    public Acc_to_bkash_wallet(Salary sr, Savings sv)
    {
        salary = sr;
        savings = sv;
    }

    public double acc_to_bkash_wallet(Salary sr)
    {
        return amount = sr.balance();
    }

    public double acc_to_bkash_wallet(Savings sv)
    {
        return amount = sv.balance();
    }

    public double acc_to_bkash_wallet(Salary sr, Savings sv)
    {
        return amount = sr.balance() + sv.balance();
    }

    // public void bkash_cashin(double money, Bkash_to_acc bk) 
    // {
    //     // amount = acc_to_bkash_wallet(salary, savings);
    //     amount = acc_to_bkash_wallet(salary);//, savings);
    //     System.out.println(amount + " " + money);
    //     if(amount >= money)
    //     {
    //         System.out.println("Added " + money + "to account.");
    //         bk.bakashWallet_addMoney(money);
    //         amount -= money;
    //         salary.update(salary.balance() - money);
    //         // return true;
    //     }
    //     else
    //     {
    //         System.out.println("Not enough balance!");
    //         // return false;
    //     }
    // }


    public void bkash_cashin(double money, Bkash_to_acc bk, Salary sr) // money transfer from sr acc to bk acc 
    {
        if(sr.balance() >= money)
        {
            System.out.println("Added " + money + " to account.");
            bk.bakashWallet_addMoney(money);
            sr.update(sr.balance() - money);
            // return true;
        }
        else
        {
            System.out.println("Not enough balance!");
            // return false;
        }
    }


    public void bkash_cashin(double money, Bkash_to_acc bk, Savings sv) // money transfer from sv acc to bk acc 
    {
        if(sv.balance() >= money)
        {
            System.out.println("Added " + money + " to account.");
            bk.bakashWallet_addMoney(money);
            sv.update(sv.balance() - money);
            // return true;
        }
        else
        {
            System.out.println("Not enough balance!");
            // return false;
        }
    }

    public void bkash_cashin(double money, Bkash_to_acc bk, Both both) // money transfer from both (savings and salary) acc to bk acc 
    {
        if(both.salary.balance() >= money)
        {
            System.out.println("Added " + money + " to account.");
            bk.bakashWallet_addMoney(money);
            both.salary.update(both.salary.balance() - money);
            // return true;
        }
        else if(both.savings.balance() >= money)
        {
            System.out.println("Added " + money + " to account.");
            bk.bakashWallet_addMoney(money);
            both.savings.update(both.savings.balance() - money);
            // return true;
        }
        else if(both.savings.balance() + both.salary.balance() >= money)
        {
            System.out.println("Added " + money + " to account.");
            bk.bakashWallet_addMoney(money);
            money -= both.savings.balance();
            both.savings.update(0);
            both.salary.update(both.salary.balance() - money);
            // return true;
        }
        else
        {
            System.out.println("Not enough balance!");
            // return false;
        }
    }

    public void print()
    {
        System.out.println("Total Bkash Balance: " + amount);
    }

}
