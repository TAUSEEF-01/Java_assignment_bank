package customers.organization;

import customers.features.customerAttributes.Customer_attributes;

public class Organization {
    public String accNum="", bankName="", email="", name="", phnNum="", tin="";
    public Customer_attributes[] organization;
    public int sz, curr_sz;
    public double money;

    public Organization(int n)
    {
        this.sz = n;
        this.curr_sz = 0;
        this.money = 0;
        organization = new Customer_attributes[n];
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
            organization[i].salary.update(money);
            organization[i].savings.update(money);
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
        }
    }
}
