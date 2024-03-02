import customers.features.customerAttributes.Customer_attributes;
import customers.features.customerAttributes.accountNumber.Account_number;
import customers.organization.Organization;
import customers.singlePerson.Single_person;
import employee.Employee;
import employee.manager.Manager;
import employee.officer.Officer;
import employee.trainee.Trainee;

public class Bank
{
    public static void main(String args[])
    {
        // /* */
        // Customer_attributes c = new Customer_attributes();
        // c.a = "name";
        // c.acc_number.update(c.a);
        // c.acc_number.print();



        // /* */
        Single_person sp = new Single_person(2);

        // sp.accNum = "yolo";
        // sp.bankName = "dtc";
        // sp.bin = "834";
        // sp.email = "hfh011@gmail.com";
        // sp.phnNum = "9284742";
        // sp.name = "jojo";
        // sp.money = 131.2;

        

        // sp.create(1);
        // sp.print();

        // sp.singleCustomer[0].salary.update(1983.981);
        // sp.print();

        // sp.singleCustomer[0].salary.add(920);
        // sp.print();


        sp.selected_user(0);
        sp.singleCustomer[0].acc_number.update("jjdf");
        sp.singleCustomer[0].bank_name.update("jjdf");
        sp.singleCustomer[0].email.update("jjdf");
        sp.singleCustomer[0].name.update("jjdf");
        sp.singleCustomer[0].phone_number.update("jjdf");
        sp.singleCustomer[0].bin.update("jjdf");
        sp.singleCustomer[0].salary.update(101.091);


        sp.selected_user(1);
        sp.singleCustomer[1].acc_number.update("jjdf");
        sp.singleCustomer[1].bank_name.update("jjdf");
        sp.singleCustomer[1].email.update("jjdf");
        sp.singleCustomer[1].name.update("jjdf");
        sp.singleCustomer[1].phone_number.update("jjdf");
        sp.singleCustomer[1].bin.update("jjdf");
        sp.singleCustomer[1].salary.update(50505.091);
        sp.singleCustomer[1].savings.update(505.091);


        sp.singleCustomer[0].salary.print();
        sp.singleCustomer[1].salary.print();

        sp.singleCustomer[0].savings.print();
        sp.singleCustomer[1].savings.print();


        sp.singleCustomer[1].savings.timeUpdate(3650);
        sp.singleCustomer[1].savings.print();





        // /* */
        // Organization org = new Organization(1);

        // org.accNum = "yolo";
        // org.bankName = "dtc";
        // org.tin = "834";
        // org.email = "hfh011@gmail.com";
        // org.phnNum = "9284742";
        // org.name = "jojo";

        // org.create(1);
        // org.print();




        // /* */
        // Manager mngr = new Manager(1);

        // mngr.email="reuuir@gmail.com";
        // mngr.name = "udhfh";
        // mngr.phnNum= "01937321312";
        
        // mngr.create(1);
        // // mngr.print();


        // Officer ofcr = new Officer(1);
        // ofcr.email="er@gmail.com";
        // ofcr.name = "lol";
        // ofcr.phnNum= "029374";

        // ofcr.create(1);
        // // ofcr.print();


        // Trainee trne = new Trainee(1);
        // trne.email="ff@gmail.com";
        // trne.name = "fhg";
        // trne.phnNum= "01867312";

        // trne.create(1);
        // // trne.print();

        // Employee emp = new Employee();
        // emp.print(mngr, ofcr, trne);
    }
}




/*
    javac customers/features/customerAttributes/Customer_attributes.java customers/features/customerAttributes/accountNumber/Account_number.java Bank.java customers/singlePerson/Single_person.java  customers/features/customerAttributes/bankName/Bank_name.java customers/features/customerAttributes/BIN_number/Bin_number.java customers/features/customerAttributes/name/Name.java customers/features/customerAttributes/email/Email.java customers/features/customerAttributes/phoneNumber/Phone_number.java customers/features/customerAttributes/TIN_Number/Tin_number.java customers/features/customerAttributes/name/Name.java employee/employee_attributes/Employee_attributes.java employee/manager/Manager.java employee/officer/Officer.java employee/trainee/Trainee.java employee/Employee.java customers/organization/Organization.java customers/features/accountType/salary/Salary.java customers/features/accountType/savings/Savings.java customers/features/scheme/interest/Interest.java customers/features/scheme/texCut/Texcut.java customers/features/money_exchange/moneySendToAccount/BkashToAcc/Bkash_to_acc.java customers/features/money_exchange/moneySendToAccount/EFT/Eft.java customers/features/money_exchange/moneySendToAccount/recipt/Recipt.java 
*/