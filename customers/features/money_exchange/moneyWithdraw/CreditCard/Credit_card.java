package customers.features.money_exchange.moneyWithdraw.CreditCard;

import customers.features.accountType.both.Both;
import customers.features.accountType.salary.Salary;
import customers.features.accountType.savings.Savings;


public class Credit_card {
    public Both both;

    public void update(Both bt)
    {
        this.both = bt;
    }

    public void cashout(double money)
    {
        if(both.salary.balance() >= money)
        {
            System.out.println("Amount of cash out by credit card: " + money);
            both.salary.update(both.salary.balance() - money);
        }
        else if(both.savings.balance() >= money)
        {
            System.out.println("Amount of cash out by credit card: " + money);
            both.savings.update(both.savings.balance() - money);
        }
        else if(both.savings.balance() + both.salary.balance() >= money)
        {
            System.out.println("Amount of cash out by credit card: " + money);
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







// public class Credit_card {
//     // public double amount;
//     // public Savings savings;
//     // public Salary salary;
//     public Both both;


//     // public Credit_card(Savings sv)
//     // {
//     //     savings = sv;
//     //     salary = null;
//     // }

//     // public Credit_card(Salary sr)
//     // {
//     //     salary = sr;
//     //     savings = null;
//     // }

//     // public Credit_card(Salary sr, Savings sv)
//     // {
//     //     savings = sv;
//     //     salary = sr;
//     // }

//     // public Credit_card(Both bt)
//     // {
//     //     both = bt;
//     // }

//     // public void cashout(double n)
//     // {
//     //     if(savings == null)
//     //     {
//     //         // System.out.println("1");
//     //         if(salary.balance() >= n)
//     //         {
//     //             salary.update(salary.balance() - n);
//     //         }
//     //         else
//     //         {
//     //             System.out.println("Not enough balance!");
//     //         }
//     //     }
//     //     else if(salary == null)
//     //     {
//     //         // System.out.println("2");
//     //         if(savings.balance() >= n)
//     //         {
//     //             savings.update(savings.balance() - n);
//     //         }
//     //         else
//     //         {
//     //             System.out.println("Not enough balance!");
//     //         }
//     //     }
//     //     else
//     //     {
//     //         // System.out.println("3");
//     //         if(salary.balance() >= n)
//     //         {
//     //             salary.update(salary.balance() - n);
//     //         }
//     //         else if(savings.balance() >= n)
//     //         {
//     //             savings.update(savings.balance() - n);
//     //         }
//     //         else
//     //         {
//     //             System.out.println("Not enough balance!");
//     //         }
//     //     }
//     // }


//     public void update(Both bt)
//     {
//         this.both = bt;
//     }



//     // public void cashout(double money, Both both)
//     // {
//     //     if(both.salary.balance() >= money)
//     //     {
//     //         System.out.println("Amount of cash out by credit card: " + money);
//     //         both.salary.update(both.salary.balance() - money);
//     //     }
//     //     else if(both.savings.balance() >= money)
//     //     {
//     //         System.out.println("Amount of cash out by credit card: " + money);
//     //         both.savings.update(both.savings.balance() - money);
//     //     }
//     //     else if(both.savings.balance() + both.salary.balance() >= money)
//     //     {
//     //         System.out.println("Amount of cash out by credit card: " + money);
//     //         money -= both.savings.balance();
//     //         both.savings.update(0);
//     //         both.salary.update(both.salary.balance() - money);
//     //     }
//     //     else
//     //     {
//     //         System.out.println("Not enough balance!");
//     //     }
//     // }


//     public void cashout(double money)
//     {
//         if(both.salary.balance() >= money)
//         {
//             System.out.println("Amount of cash out by credit card: " + money);
//             both.salary.update(both.salary.balance() - money);
//         }
//         else if(both.savings.balance() >= money)
//         {
//             System.out.println("Amount of cash out by credit card: " + money);
//             both.savings.update(both.savings.balance() - money);
//         }
//         else if(both.savings.balance() + both.salary.balance() >= money)
//         {
//             System.out.println("Amount of cash out by credit card: " + money);
//             money -= both.savings.balance();
//             both.savings.update(0);
//             both.salary.update(both.salary.balance() - money);
//         }
//         else
//         {
//             System.out.println("Not enough balance!");
//         }
//     }
// }
