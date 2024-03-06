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
        /* */
        Single_person sp = new Single_person(2);

        // initializing values:

        // 1st way to initialize values:
        sp.accNum = "123";
        sp.bankName = "Dutch Bangla Bank";
        sp.bin = "1000";
        sp.email = "mdtauseef.rahmang01@gmail.com";
        sp.phnNum = "018********";
        sp.name = "Md. Tauseef - Ur - Rahman";
        sp.salary = 2000.0;
        sp.savings = 1000.0;
        sp.bkash = 500.0;
        sp.eft = 500.0;

        sp.create(2); // same values are initialized for all accounts
        sp.print();


        // 2nd way to initialize values:
        sp.singleCustomer[1].acc_number.update("246");
        sp.singleCustomer[1].bank_name.update("Islami Bank");
        sp.singleCustomer[1].email.update("ash02@gmail.com");
        sp.singleCustomer[1].name.update("Ashraful Alam");
        sp.singleCustomer[1].phone_number.update("017********");
        sp.singleCustomer[1].bin.update("2000");
        sp.singleCustomer[1].bkash_to_acc.bkashWallet(300.0);
        sp.singleCustomer[1].eft.eft_balance(400.0);
        sp.singleCustomer[1].both.update(1300.0, 700.0);

        sp.print_selected_user(1);



        // transactions:

        // Money send to account: -->
        // bkash to acc:
        System.out.println("bkash to acc:");
        // from his bkash account to his own bank account:
        sp.singleCustomer[0].bkash_to_acc.print_balance();
        sp.singleCustomer[0].both.salary.print();
        sp.singleCustomer[0].bkash_to_acc.addMoney_bankAcc(100, sp.singleCustomer[0].both);
        sp.singleCustomer[0].bkash_to_acc.print_balance();
        sp.singleCustomer[0].both.salary.print();
        System.out.println();

        // from his bkash account to another person's bank account:
        sp.singleCustomer[0].bkash_to_acc.print_balance();
        sp.singleCustomer[1].both.salary.print();
        sp.singleCustomer[0].bkash_to_acc.addMoney_bankAcc(100, sp.singleCustomer[1].both);
        sp.singleCustomer[0].bkash_to_acc.print_balance();
        sp.singleCustomer[1].both.salary.print();
        System.out.println();



        // eft to acc: 
        System.out.println("eft to acc:");
        // from his eft account to his own bank account:
        sp.singleCustomer[0].eft.print_balance();
        sp.singleCustomer[0].both.salary.print();
        sp.singleCustomer[0].eft.addMoney_bankAcc(100, sp.singleCustomer[0].both);
        sp.singleCustomer[0].eft.print_balance();
        sp.singleCustomer[0].both.salary.print();
        System.out.println();

        // from his eft account to another person's bank account:
        sp.singleCustomer[0].eft.print_balance();
        sp.singleCustomer[1].both.salary.print();
        sp.singleCustomer[0].eft.addMoney_bankAcc(100, sp.singleCustomer[1].both);
        sp.singleCustomer[0].eft.print_balance();
        sp.singleCustomer[1].both.salary.print();
        System.out.println();


        // recipt to acc:
        System.out.println("recipt to acc:");
        // cash in using check:
        sp.singleCustomer[0].both.print();
        sp.singleCustomer[0].recipt.addMoney_bankAcc(990, sp.singleCustomer[0].both, 1);
        sp.singleCustomer[0].both.print();
        System.out.println();
        
        
        
        // Money withdraw: -->
        // account to bkash wallet:
        System.out.println("bkash to acc:");
        // from his bkash account to his own bank account:
        System.out.println("Before cash out: ");
        sp.singleCustomer[0].both.print();
        sp.singleCustomer[0].bkash_to_acc.print_balance();
        System.out.println();
        sp.singleCustomer[0].acc_to_bkash_wallet.bkash_cashin(150, sp.singleCustomer[0].bkash_to_acc, sp.singleCustomer[0].both);
        System.out.println("After transferring money from bank account to bkash account: ");
        sp.singleCustomer[0].both.print();
        sp.singleCustomer[0].bkash_to_acc.print_balance();
        System.out.println();



        // credit card:
        System.out.println("Money withdraw using credit card:");
        sp.singleCustomer[0].both.print();
        System.out.println();
        sp.singleCustomer[0].credit_card.cashout(1000);
        sp.singleCustomer[0].both.print();
        System.out.println();



        // check:
        System.out.println("Money withdraw using check:");
        sp.singleCustomer[0].both.print();
        System.out.println();
        sp.singleCustomer[0].credit_card.cashout(1000);
        sp.singleCustomer[0].both.print();
        // sp.singleCustomer[0].credit_card.cashout(2000);
        // sp.singleCustomer[0].both.print();
        System.out.println();



        
        System.out.println();
        System.out.println("Current balance status:");
        System.out.println("Person 1:");
        sp.singleCustomer[0].both.print();
        System.out.println("Person 2:");
        sp.singleCustomer[1].both.print();
        System.out.println();


        // scheme test:
        // interest scheme:
        System.out.println("Updated time for person 1:");
        sp.singleCustomer[0].both.timeUpdate(365 * 2);
        sp.singleCustomer[0].both.print();
        System.out.println();
        System.out.println("Time not updated for person 2:");
        sp.singleCustomer[1].both.print();
        System.out.println();
    }
}




/*
    javac customers/features/customerAttributes/Customer_attributes.java customers/features/customerAttributes/accountNumber/Account_number.java Bank.java customers/singlePerson/Single_person.java  customers/features/customerAttributes/bankName/Bank_name.java customers/features/customerAttributes/BIN_number/Bin_number.java customers/features/customerAttributes/name/Name.java customers/features/customerAttributes/email/Email.java customers/features/customerAttributes/phoneNumber/Phone_number.java customers/features/customerAttributes/TIN_Number/Tin_number.java customers/features/customerAttributes/name/Name.java employee/employee_attributes/Employee_attributes.java employee/manager/Manager.java employee/officer/Officer.java employee/trainee/Trainee.java employee/Employee.java customers/organization/Organization.java customers/features/accountType/salary/Salary.java customers/features/accountType/savings/Savings.java customers/features/scheme/interest/Interest.java customers/features/scheme/texCut/Texcut.java customers/features/money_exchange/moneySendToAccount/BkashToAcc/Bkash_to_acc.java customers/features/money_exchange/moneySendToAccount/EFT/Eft.java customers/features/money_exchange/moneySendToAccount/recipt/Recipt.java customers/features/money_exchange/moneyWithdraw/AccToBkashWallet/Acc_to_bkash_wallet.java customers/features/money_exchange/moneyWithdraw/check/Check.java customers/features/money_exchange/moneyWithdraw/CreditCard/Credit_card.java 
*/



















            // /* */
            // Single_person sp = new Single_person(1);

            // sp.accNum = "yolo";
            // sp.bankName = "dtc";
            // sp.bin = "834";
            // sp.email = "hfh011@gmail.com";
            // sp.phnNum = "9284742";
            // sp.name = "jojo";
            // sp.money = 131.2;
            // sp.salary = 1233.4;
            // sp.savings = 292.0;
            // sp.bkash = 800.0;
            // sp.eft = 9.0;


            // sp.create(1);
            // sp.print();

            // sp.singleCustomer[0].salary.print();
            // System.out.println();

            // sp.singleCustomer[0].salary.add(100, sp.singleCustomer[0].bkash_to_acc);
            // sp.singleCustomer[0].salary.print();
            // System.out.println();

            // sp.singleCustomer[0].salary.add(100, sp.singleCustomer[0].rcpt);
            // sp.singleCustomer[0].salary.print();
            // sp.singleCustomer[0].bkash_to_acc.print_balance();
            // System.out.println();

            // sp.singleCustomer[0].acc_to_bkash_wallet.bkash_cashin(100, sp.singleCustomer[0].bkash_to_acc);
            // sp.singleCustomer[0].salary.print();
            // sp.singleCustomer[0].bkash_to_acc.print_balance();
            // System.out.println();

            // sp.singleCustomer[0].check.cashout(1000);
            // sp.singleCustomer[0].salary.print();
            // System.out.println();

            // sp.singleCustomer[0].check.cashout(1000);
            // sp.singleCustomer[0].salary.print();
            // System.out.println();

            // sp.singleCustomer[0].salary.add(800, sp.singleCustomer[0].bkash_to_acc);
            // sp.singleCustomer[0].salary.print();
            // sp.singleCustomer[0].bkash_to_acc.print_balance();
            // System.out.println();

            // sp.singleCustomer[0].credit_card.cashout(100);
            // sp.singleCustomer[0].salary.print();
            // sp.singleCustomer[0].bkash_to_acc.print_balance();
            // System.out.println();

            // sp.singleCustomer[0].acc_to_bkash_wallet.bkash_cashin(150, sp.singleCustomer[0].bkash_to_acc);
            // sp.singleCustomer[0].salary.print();
            // sp.singleCustomer[0].bkash_to_acc.print_balance();
            // System.out.println();





        // /* */
        // System.out.println();
        // System.out.println();

        // Single_person sp = new Single_person(1);

        // sp.accNum = "yolo";
        // sp.bankName = "dtc";
        // sp.bin = "834";
        // sp.email = "hfh011@gmail.com";
        // sp.phnNum = "9284742";
        // sp.name = "jojo";
        // sp.money = 131.2;
        // sp.salary = 1233.4;
        // sp.savings = 292.0;
        // sp.bkash = 800.0;
        // sp.eft = 9.0;


        // sp.create(1);
        // sp.print();

        // sp.singleCustomer[0].both.salary.print();
        // System.out.println();

        // sp.singleCustomer[0].both.salary.add(100, sp.singleCustomer[0].bkash_to_acc);
        // sp.singleCustomer[0].both.salary.print();
        // System.out.println();

        // sp.singleCustomer[0].both.salary.add(100, sp.singleCustomer[0].rcpt);
        // sp.singleCustomer[0].both.salary.print();
        // sp.singleCustomer[0].bkash_to_acc.print_balance();
        // System.out.println();

        // sp.singleCustomer[0].acc_to_bkash_wallet.bkash_cashin(100, sp.singleCustomer[0].bkash_to_acc);
        // sp.singleCustomer[0].both.salary.print();
        // sp.singleCustomer[0].bkash_to_acc.print_balance();
        // System.out.println();

        // sp.singleCustomer[0].check.cashout(1000);
        // sp.singleCustomer[0].both.salary.print();
        // System.out.println();

        // sp.singleCustomer[0].check.cashout(1000);
        // sp.singleCustomer[0].both.salary.print();
        // System.out.println();

        // sp.singleCustomer[0].both.salary.add(800, sp.singleCustomer[0].bkash_to_acc);
        // sp.singleCustomer[0].both.salary.print();
        // sp.singleCustomer[0].bkash_to_acc.print_balance();
        // System.out.println();

        // sp.singleCustomer[0].credit_card.cashout(100);
        // sp.singleCustomer[0].both.salary.print();
        // sp.singleCustomer[0].bkash_to_acc.print_balance();
        // System.out.println();

        // sp.singleCustomer[0].acc_to_bkash_wallet.bkash_cashin(150, sp.singleCustomer[0].bkash_to_acc);
        // sp.singleCustomer[0].both.salary.print();
        // sp.singleCustomer[0].bkash_to_acc.print_balance();
        // System.out.println();






        // /* */
        // System.out.println();
        // System.out.println();

        // Single_person sp2 = new Single_person(2);

        // sp2.selected_user(0);
        // sp2.singleCustomer[0].acc_number.update("jjdf");
        // sp2.singleCustomer[0].bank_name.update("jjdf");
        // sp2.singleCustomer[0].email.update("jjdf");
        // sp2.singleCustomer[0].name.update("jjdf");
        // sp2.singleCustomer[0].phone_number.update("jjdf");
        // sp2.singleCustomer[0].bin.update("jjdf");
        // sp2.singleCustomer[0].salary.update(101.091);


        // sp2.selected_user(1);
        // sp2.singleCustomer[1].acc_number.update("jjdf");
        // sp2.singleCustomer[1].bank_name.update("jjdf");
        // sp2.singleCustomer[1].email.update("jjdf");
        // sp2.singleCustomer[1].name.update("jjdf");
        // sp2.singleCustomer[1].phone_number.update("jjdf");
        // sp2.singleCustomer[1].bin.update("jjdf");
        // sp2.singleCustomer[1].salary.update(50505.091);
        // sp2.singleCustomer[1].savings.update(505.091);


        // sp2.singleCustomer[0].salary.print();
        // sp2.singleCustomer[1].salary.print();

        // sp2.singleCustomer[0].savings.print();
        // sp2.singleCustomer[1].savings.print();


        // sp2.singleCustomer[1].savings.timeUpdate(3650);
        // sp2.singleCustomer[1].savings.print();




        // /* */
        // System.out.println();
        // System.out.println();

        // Single_person sp2 = new Single_person(2);

        // sp2.selected_user(0);
        // sp2.singleCustomer[0].acc_number.update("jjdf");
        // sp2.singleCustomer[0].bank_name.update("jjdf");
        // sp2.singleCustomer[0].email.update("jjdf");
        // sp2.singleCustomer[0].name.update("jjdf");
        // sp2.singleCustomer[0].phone_number.update("jjdf");
        // sp2.singleCustomer[0].bin.update("jjdf");
        // sp2.singleCustomer[0].both.salary.update(101.091);


        // sp2.selected_user(1);
        // sp2.singleCustomer[1].acc_number.update("jjdf");
        // sp2.singleCustomer[1].bank_name.update("jjdf");
        // sp2.singleCustomer[1].email.update("jjdf");
        // sp2.singleCustomer[1].name.update("jjdf");
        // sp2.singleCustomer[1].phone_number.update("jjdf");
        // sp2.singleCustomer[1].bin.update("jjdf");
        // sp2.singleCustomer[1].both.salary.update(50505.091);
        // sp2.singleCustomer[1].both.savings.update(505.091);


        // sp2.singleCustomer[0].both.salary.print();
        // sp2.singleCustomer[1].both.salary.print();

        // sp2.singleCustomer[0].both.savings.print();
        // sp2.singleCustomer[1].both.savings.print();


        // sp2.singleCustomer[1].both.savings.timeUpdate(3650);
        // sp2.singleCustomer[1].both.savings.print();



        // /* */
        // System.out.println();
        // System.out.println();


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
        // System.out.println();
        // System.out.println();


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





