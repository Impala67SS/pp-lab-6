import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;


    public class Main { public static void main(String[]args) {
    
    Worker worker1 = new Worker("Jacek",3000, "2024.05.05" , "Pracownik" , 1 );
    Worker worker2 = new Worker("Franek",2000, "2024.02.01" , "Kierownik", 5);
    Worker worker3 = new Worker("Darek",5000, "2024.04.22" , "Pracownik", 5);
    Worker worker4 = new Worker("Jolka",4000, "2024.03.12" , "Pracownik", 5);
    Worker worker5 = new Worker("Grzechu", 5500, "2021-02-14", "Pracownik", 5);
    
    Manager manager1 = new Manager("Pan Zbigniew", 10000,"2020-12-10 ", "Manager ", 6);
    Manager manager2 = new Manager("Pan Wirgiliusz", 15000,"2010-09-11 ", "Manager ", 7);

                                List<Employee> employees = new ArrayList<>();
                                employees.add(worker1); employees.add(worker2); employees.add(worker3); employees.add(worker4); employees.add(worker5);
                                employees.add(manager1); employees.add(manager2);

double totalSalaryAllEmployess = employees.stream().mapToDouble(Employee::getSalary).sum();
double totalSalaryAllManagers = employees.stream().filter(e -> e instanceof Manager).mapToDouble(Employee::getSalary).sum();
double totalSalaryAllWorkers = employees.stream().filter(e -> e instanceof Worker).mapToDouble(Employee::getSalary).sum();

    System.out.println("Pensja pracowników: " + totalSalaryAllEmployess);
    System.out.println("Pensja wodzów: " + totalSalaryAllManagers);
    System.out.println("Pensja Wszystkich: " + totalSalaryAllWorkers);

    Map<Integer, List<Employee>> employeesById = new HashMap<>();
    for (Employee employee : employees) {
        int id = employee.getId();
        if (!employeesById.containsKey(id)) { employeesById.put(id, new ArrayList<>());}
        employeesById.get(id).add(employee);}

    int searchId = 1;
    List<Employee> employeesWithSameId = employeesById.get(searchId);
    if (employeesWithSameId != null) {
     System.out.println("Pracownicy z tym samym ID (" + searchId + "):");
    for (Employee employee : employeesWithSameId) {     System.out.println(employee.getName()); }} 
    else {
    System.out.println("Brak pracowników o ID: " + searchId);
    }
}
}