package customers.features.money_exchange.moneyWithdraw.check;

import customers.features.accountType.both.Both;
import customers.features.accountType.salary.Salary;
import customers.features.accountType.savings.Savings;

public class Check {
    public Both both;

    public void update(Both bt)
    {
        this.both = bt;
    }

    public void cashout(double money)
    {
        if(both.salary.balance() >= money)
        {
            System.out.println("Amount of cash out by check: " + money);
            both.salary.update(both.salary.balance() - money);
        }
        else if(both.savings.balance() >= money)
        {
            System.out.println("Amount of cash out by check: " + money);
            both.savings.update(both.savings.balance() - money);
        }
        else if(both.savings.balance() + both.salary.balance() >= money)
        {
            System.out.println("Amount of cash out by check: " + money);
            money -= both.savings.balance();
            both.savings.update(0);
            both.salary.update(both.salary.balance() - money);
        }
        else
        {
            System.out.println("Not enough balance!");
        }
    }
}
