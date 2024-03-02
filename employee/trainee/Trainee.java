package employee.trainee;

import employee.employee_attributes.Employee_attributes;

public class Trainee {
    public String email="", name="", phnNum="";
    public Employee_attributes[] trainee;
    public int sz, curr_sz;

    public Trainee(int n)
    {
        this.sz = n;
        this.curr_sz = 0;
        trainee = new Employee_attributes[n];
    }

    public void create(int n)
    {
        for(int i = curr_sz; i < curr_sz + n; i++)
        {    
            trainee[i] = new Employee_attributes();
            trainee[i].email.update(email);
            trainee[i].name.update(name);
            trainee[i].phone_number.update(phnNum);
        }
        curr_sz += n;
    }

    public void print()
    {
        for(int i = 0; i < this.curr_sz; i++)
        {    
            trainee[i].email.print();
            trainee[i].name.print();
            trainee[i].phone_number.print();
        }
    }

    public void print(int n)
    {
        for(int i = 0; i < n; i++)
        {    
            trainee[i].email.print();
            trainee[i].name.print();
            trainee[i].phone_number.print();
        }
    }
}
