package employee.manager;

import employee.employee_attributes.Employee_attributes;

public class Manager {
    public String email="", name="", phnNum="";
    public Employee_attributes[] manager;
    public int sz, curr_sz;

    public Manager(int n)
    {
        this.sz = n;
        this.curr_sz = 0;
        manager = new Employee_attributes[n];
    }

    public void create(int n)
    {
        for(int i = curr_sz; i < curr_sz + n; i++)
        {    
            manager[i] = new Employee_attributes();
            manager[i].email.update(email);
            manager[i].name.update(name);
            manager[i].phone_number.update(phnNum);
        }
        curr_sz += n;
    }

    public void print()
    {
        for(int i = 0; i < this.curr_sz; i++)
        {    
            manager[i].email.print();
            manager[i].name.print();
            manager[i].phone_number.print();
        }
    }

    public void print(int n)
    {
        for(int i = 0; i < n; i++)
        {    
            manager[i].email.print();
            manager[i].name.print();
            manager[i].phone_number.print();
        }
    }
}
