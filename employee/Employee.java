package employee;

import employee.manager.Manager;
import employee.officer.Officer;
import employee.trainee.Trainee;

public class Employee {

    public void print(Manager mngr, Officer ofcr, Trainee trne)
    {       
        System.out.println("Manger information: ");
        mngr.print();
        System.out.println();

        System.out.println("Officer information: ");
        ofcr.print();
        System.out.println();

        System.out.println("Trainee information: ");
        trne.print();
        System.out.println();
    }
}
