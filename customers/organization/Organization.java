package customers.organization;

import customers.features.customerAttributes.Customer_attributes;

public class Organization {
    // public String accNum="", bankName="", email="", name="", phnNum="", tin="";
    public String accNum, bankName, email, name, phnNum, tin;
    public double salary, savings, bkash, eft;
    public Customer_attributes[] organization;
    public int sz, curr_sz;
    public double money;

    public Organization(int n)
    {
        this.sz = n;
        this.curr_sz = 0;
        this.money = 0;
        this.accNum="";
        this.bankName="";
        this.email="";
        this.name="";
        this.phnNum="";
        this.tin="";
        this.salary =0;
        this.savings =0;
        this.bkash =0;
        this.eft =0;

        organization = new Customer_attributes[n];
    }

    public void selected_user(int n)
    {
        organization[n] = new Customer_attributes();
    }

    public void create(int n)
    {
        for(int i = curr_sz; i < curr_sz + n; i++)
        {    
            organization[i] = new Customer_attributes();
            organization[i].acc_number.update(accNum);
            organization[i].bank_name.update(bankName);
            organization[i].email.update(email);
            organization[i].name.update(name);
            organization[i].phone_number.update(phnNum);
            organization[i].tin.update(tin);
            organization[i].salary.update(salary);
            organization[i].savings.update(savings);
            organization[i].bkash_to_acc.bkashWallet(bkash);
            organization[i].eft.eft_balance(eft);
        }
        curr_sz += n;
    }

    public void print()
    {
        for(int i = 0; i < this.curr_sz; i++)
        {    
            organization[i].acc_number.print();
            organization[i].bank_name.print();
            organization[i].email.print();
            organization[i].name.print();
            organization[i].phone_number.print();
            organization[i].tin.print();
            organization[i].salary.print();
            organization[i].savings.print();
            organization[i].bkash_to_acc.print_balance();
            organization[i].eft.print_balance();
        }
    }

    public void print(int n)
    {
        for(int i = 0; i < n; i++)
        {    
            organization[i].acc_number.print();
            organization[i].bank_name.print();
            organization[i].email.print();
            organization[i].name.print();
            organization[i].phone_number.print();
            organization[i].tin.print();
            organization[i].salary.print();
            organization[i].savings.print();
            organization[i].bkash_to_acc.print_balance();
            organization[i].eft.print_balance();
        }
    }

    public void print_selected_user(int n)
    {
        organization[n].acc_number.print();
        organization[n].bank_name.print();
        organization[n].email.print();
        organization[n].name.print();
        organization[n].phone_number.print();
        organization[n].bin.print();
        organization[n].salary.print();
        organization[n].savings.print();
        organization[n].bkash_to_acc.print_balance();
        organization[n].eft.print_balance();
    }
}
