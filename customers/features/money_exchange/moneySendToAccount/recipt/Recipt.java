package customers.features.money_exchange.moneySendToAccount.recipt;

import customers.features.accountType.salary.Salary;
import customers.features.accountType.savings.Savings;

public class Recipt {

    public void addMoney_bankAcc(double money, Salary sr)
    {
        sr.add(money);
    }

    public void addMoney_bankAcc(double money, Savings sv)
    {
        sv.add(money);
    }
}
