import java.util.ArrayList;
import java.util.List;

import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;


public class Main { public static void main(String[]args) {
    
    Worker worker1 = new Worker("Jacek",3000, "2024.05.05" , "Pracownik" , 1 );
    Worker worker2 = new Worker("Franek",2000, "2024.02.01" , "Kierownik", 2);
    Worker worker3 = new Worker("Darek",5000, "2024.04.22" , "Pracownik", 3);
    Worker worker4 = new Worker("Jolka",4000, "2024.03.12" , "Pracownik", 4);
    
    Manager manager = new Manager("Pan Zbigniew", 10000,"2020-12-10 ", "Manager ", 5);


                List<Employee> employees = new ArrayList<>();
employees.add(worker1); employees.add(worker2);employees.add(worker3);employees.add(worker4);
employees.add(manager);

for (Employee employee : employees) {
    System.out.println("- " + employee.getName() + " (ID: " + employee.hashCode() +
                    ", Position: " + employee.getPosition() +", Hire date: " + employee.getHireDate() +", Salary: " + employee.getSalary() + ")");
            employee.work();
        }
    }
}

