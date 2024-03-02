package customers.features.customerAttributes;
import customers.features.accountType.salary.Salary;
import customers.features.accountType.savings.Savings;
import customers.features.customerAttributes.BIN_number.Bin_number;
import customers.features.customerAttributes.TIN_Number.Tin_number;
import customers.features.customerAttributes.accountNumber.Account_number;
import customers.features.customerAttributes.bankName.Bank_name;
import customers.features.customerAttributes.email.Email;
import customers.features.customerAttributes.name.Name;
import customers.features.customerAttributes.phoneNumber.Phone_number;

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
    }

    public void print()
    {
        acc_number.print();
        bank_name.print();
        email.print();
        name.print();
        phone_number.print();
        tin.print();
        bin.print();
        salary.print();
        savings.print();
    }
}

