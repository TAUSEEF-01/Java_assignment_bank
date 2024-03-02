package customers.singlePerson;

import customers.features.customerAttributes.Customer_attributes;

public class Single_person {
    public String accNum="", bankName="", email="", name="", phnNum="", bin="";
    public Customer_attributes[] singleCustomer;
    public int sz, curr_sz;
    public double money;

    public Single_person(int n)
    {
        this.sz = n;
        this.curr_sz = 0;
        this.money = 0;
        singleCustomer = new Customer_attributes[n];
    }

    public void selected_user(int n)
    {
        singleCustomer[n] = new Customer_attributes();
    }

    public void create(int n)
    {
        for(int i = curr_sz; i < curr_sz + n; i++)
        {    
            singleCustomer[i] = new Customer_attributes();
            singleCustomer[i].acc_number.update(accNum);
            singleCustomer[i].bank_name.update(bankName);
            singleCustomer[i].email.update(email);
            singleCustomer[i].name.update(name);
            singleCustomer[i].phone_number.update(phnNum);
            singleCustomer[i].bin.update(bin);
            singleCustomer[i].salary.update(money);
            singleCustomer[i].savings.update(money);
        }
        curr_sz += n;
    }

    public void print()
    {
        for(int i = 0; i < this.curr_sz; i++)
        {    
            singleCustomer[i].acc_number.print();
            singleCustomer[i].bank_name.print();
            singleCustomer[i].email.print();
            singleCustomer[i].name.print();
            singleCustomer[i].phone_number.print();
            singleCustomer[i].bin.print();
            singleCustomer[i].salary.print();
            singleCustomer[i].savings.print();
        }
    }

    public void print(int n)
    {
        for(int i = 0; i < n; i++)
        {    
            singleCustomer[i].acc_number.print();
            singleCustomer[i].bank_name.print();
            singleCustomer[i].email.print();
            singleCustomer[i].name.print();
            singleCustomer[i].phone_number.print();
            singleCustomer[i].bin.print();
            singleCustomer[i].salary.print();
            singleCustomer[i].savings.print();
        }
    }


    public void print_selected_user(int n)
    {
        singleCustomer[n].acc_number.print();
        singleCustomer[n].bank_name.print();
        singleCustomer[n].email.print();
        singleCustomer[n].name.print();
        singleCustomer[n].phone_number.print();
        singleCustomer[n].bin.print();
        singleCustomer[n].salary.print();
    }
}
