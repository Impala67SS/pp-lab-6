import company.models.Manager;
import company.models.Worker;

public class Main { public static void main(String[]args) {
    //instancje dla Worker
    Worker worker1 = new Worker("Jacek",3000, 1);
    Worker worker2 = new Worker("Franek",2000, 2);
    Worker worker3 = new Worker("Darek",5000, 3);
    Worker worker4 = new Worker("Jolka",4000, 4);
    //Manager
    Manager manager = new Manager("Pan Zbigniew", 10000, 5);


        System.out.println("Worker 1 salary is "+ worker1.getSalary());
        worker1.work();
        System.out.println("Worker 2 salary is "+ worker2.getSalary());
        worker2.work();
        System.out.println("Worker 3 salary is "+ worker3.getSalary());
        worker3.work();
        System.out.println("Worker 5 salary is "+ worker4.getSalary());
        worker4.work();
        System.out.println("Manager salary is "+ manager.getSalary());
        manager.work();



} 
}

