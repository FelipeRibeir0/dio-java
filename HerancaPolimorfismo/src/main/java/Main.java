import com.HerancaPolimorfismo.Employee;
import com.HerancaPolimorfismo.Manager;
import com.HerancaPolimorfismo.Salesman;

public class Main {
    public static void main(String[] args) {

        printEmployee(new Manager());
        printEmployee(new Salesman());

    }

    public static void printEmployee(Employee employee) {

        System.out.printf("=========%s=======\n",employee.getClass().getCanonicalName());
        switch (employee){
            case Manager manager ->{
                manager.setCode("129");
                manager.setName("João");
                manager.setSalary(5000);
                manager.setLogin("joao@test.com");
                manager.setPassword("qwerty123456");
                manager.setCommission(1200);

                System.out.println(manager.getCode());
                System.out.println(manager.getSalary());
                System.out.println(manager.getName());
                System.out.println(manager.getLogin());
                System.out.println(manager.getPassword());
                System.out.println(manager.getCommission());
                System.out.println(manager.getFullSalary(500));
            }
            case Salesman salesman ->{
                salesman.setCode("153");
                salesman.setName("Lucas");
                salesman.setSalary(2800);
                salesman.setPercentPerSold(10);
                salesman.setSoldAmount(1000);

                System.out.println(salesman.getCode());
                System.out.println(salesman.getSalary());
                System.out.println(salesman.getName());
                System.out.println(salesman.getPercentPerSold());
                System.out.println(salesman.getSoldAmount());
            }
        }
        System.out.println(employee.getFullSalary());
        System.out.println("--------------");

        System.out.println("===================");
    }
}