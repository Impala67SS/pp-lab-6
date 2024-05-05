import company.models.Manager;
import company.models.Worker;


public class Main { public static void main(String[]args) {
    
    Worker worker1 = new Worker("Jacek",3000, "2024.05.05" , "Pracownik" , 1 );
    Worker worker2 = new Worker("Franek",2000, "2024.02.01" , "Kierownik", 2);
    Worker worker3 = new Worker("Darek",5000, "2024.04.22" , "Pracownik", 5);
    Worker worker4 = new Worker("Jolka",4000, "2024.03.12" , "Pracownik", 4);
    Worker worker5 = new Worker("Grzechu", 5500, "2021-02-14", "Pracownik", 5);
    
    Manager manager = new Manager("Pan Zbigniew", 10000,"2020-12-10 ", "Manager ", 6);

System.out.println(worker1.getName() + " has code: " + worker1.hashCode());
System.out.println(worker2.getName() + " has code: " + worker2.hashCode());
System.out.println(worker3.getName() + " has code: " + worker3.hashCode());
System.out.println(worker4.getName() + " has code: " + worker4.hashCode());
System.out.println(worker5.getName() + " has code: " + worker5.hashCode());

System.out.println(manager.getName() + " has code: " + manager.hashCode());

    
    System.out.println("Is worker5 equal to worker2? " + worker5.equals(worker2));
    System.out.println("Is worker5 equal to worker3? " + worker5.equals(worker3));
    System.out.println("Is worker5 equal to manager? " + worker5.equals(manager));
}
}

