package employee.officer;

import employee.employee_attributes.Employee_attributes;

public class Officer {
    public String email="", name="", phnNum="";
    public Employee_attributes[] officer;
    public int sz, curr_sz;

    public Officer(int n)
    {
        this.sz = n;
        this.curr_sz = 0;
        officer = new Employee_attributes[n];
    }

    public void create(int n)
    {
        for(int i = curr_sz; i < curr_sz + n; i++)
        {    
            officer[i] = new Employee_attributes();
            officer[i].email.update(email);
            officer[i].name.update(name);
            officer[i].phone_number.update(phnNum);
        }
        curr_sz += n;
    }

    public void print()
    {
        for(int i = 0; i < this.curr_sz; i++)
        {    
            officer[i].email.print();
            officer[i].name.print();
            officer[i].phone_number.print();
        }
    }

    public void print(int n)
    {
        for(int i = 0; i < n; i++)
        {    
            officer[i].email.print();
            officer[i].name.print();
            officer[i].phone_number.print();
        }
    }
}
