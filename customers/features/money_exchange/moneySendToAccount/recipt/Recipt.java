package customers.features.money_exchange.moneySendToAccount.recipt;

import customers.features.accountType.both.Both;
import customers.features.accountType.salary.Salary;
import customers.features.accountType.savings.Savings;

public class Recipt {
    public Both both;

    public Recipt()
    {
        
    }

    public Recipt(Both bt)
    {
        this.both = bt;
    }

    
    public void addMoney_bankAcc(double money, Salary sr)
    {
        sr.add(money);
    }

    public void addMoney_bankAcc(double money, Savings sv)
    {
        sv.add(money);
    }

    public void addMoney_bankAcc(double money, Both bt, int choose)
    {
        if(choose ==  1)
        bt.salary.add(money);
        else 
        bt.savings.add(money);
    }

}
