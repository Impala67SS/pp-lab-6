package company.models;
import company.abstracts.Employee;

public class Manager extends Employee{
    public Manager(String name, double salary, String hireDate, String position, int id) {
        super(name, salary, id, hireDate, position);
    }
    
    @Override

    public void work() { System.out.println("Manager " +getName()+ " is managing"); }
}
