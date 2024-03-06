package customers.features.customerAttributes;
import customers.features.accountType.both.Both;
import customers.features.accountType.salary.Salary;
import customers.features.accountType.savings.Savings;
import customers.features.customerAttributes.BIN_number.Bin_number;
import customers.features.customerAttributes.TIN_Number.Tin_number;
import customers.features.customerAttributes.accountNumber.Account_number;
import customers.features.customerAttributes.bankName.Bank_name;
import customers.features.customerAttributes.email.Email;
import customers.features.customerAttributes.name.Name;
import customers.features.customerAttributes.phoneNumber.Phone_number;
import customers.features.money_exchange.moneySendToAccount.BkashToAcc.Bkash_to_acc;
import customers.features.money_exchange.moneySendToAccount.EFT.Eft;
import customers.features.money_exchange.moneySendToAccount.recipt.Recipt;
import customers.features.money_exchange.moneyWithdraw.AccToBkashWallet.Acc_to_bkash_wallet;
import customers.features.money_exchange.moneyWithdraw.CreditCard.Credit_card;
import customers.features.money_exchange.moneyWithdraw.check.Check;

public class Customer_attributes {
    public String a;

    public Account_number acc_number;
    public Bank_name bank_name;
    public Email email;
    public Name name;
    public Phone_number phone_number;
    public Tin_number tin;
    public Bin_number bin;
    public Salary salary;
    public Savings savings;
    public Bkash_to_acc bkash_to_acc;
    public Eft eft;
    public Recipt recipt;
    public Acc_to_bkash_wallet acc_to_bkash_wallet;
    public Check check;
    public Credit_card credit_card;
    public Both both;

    public Customer_attributes()
    {
        acc_number = new Account_number();
        bank_name = new Bank_name();
        email = new Email();
        name = new Name();
        phone_number = new Phone_number();
        tin = new Tin_number();
        bin = new Bin_number();
        salary = new Salary();
        savings = new Savings();
        bkash_to_acc = new Bkash_to_acc();
        eft = new Eft();
        // recipt = new Recipt();
        recipt = new Recipt(both);
        acc_to_bkash_wallet = new Acc_to_bkash_wallet(salary, savings);
        // check = new Check(salary, savings);
        check = new Check();
        // credit_card = new Credit_card(salary, savings);
        // credit_card = new Credit_card(both);
        credit_card = new Credit_card();
        both = new Both();
    }

    public void print()
    {
        System.out.println("Account Number: ");
        acc_number.print();
        bank_name.print();
        email.print();
        name.print();
        phone_number.print();
        tin.print();
        bin.print();
        salary.print();
        savings.print();
        bkash_to_acc.print_balance();
        eft.print_balance();
        both.print();
    }
}


