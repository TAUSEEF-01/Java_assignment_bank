package employee.employee_attributes;

import customers.features.customerAttributes.email.Email;
import customers.features.customerAttributes.name.Name;
import customers.features.customerAttributes.phoneNumber.Phone_number;

public class Employee_attributes {
    public String a;

    public Email email;
    public Name name;
    public Phone_number phone_number;

    public Employee_attributes()
    {
        email = new Email();
        name = new Name();
        phone_number = new Phone_number();
    }

    public void print()
    {
        email.print();
        name.print();
        phone_number.print();
    }
}
