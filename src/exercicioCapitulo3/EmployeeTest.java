package exercicioCapitulo3;

public class EmployeeTest {

    public static void main(String[] args) {
        
        Employee employee1 = new Employee("Leandro", "Barreiro", 2100.00);
        Employee employee2 = new Employee("Érica", "Barreiro", 1100.00);

        System.out.printf("%s anual salary: R$%.2f\n",employee1.getName(), employee1.getMonthlySalary() * 12);
        System.out.printf("%s anual salary: R$%.2f\n",employee2.getName(), employee2.getMonthlySalary() * 12);

        double salaryIncrease1 = (employee1.getMonthlySalary() * 0.1) + employee1.getMonthlySalary(); 
        double salaryIncrease2 = (employee2.getMonthlySalary() * 0.1) + employee2.getMonthlySalary();

        System.out.printf("%s annual salary with 10%% increase: R$%.2f\n", employee1.getName(), salaryIncrease1 * 12);
        System.out.printf("%s annual salary with 10%% increase: R$%.2f", employee2.getName(), salaryIncrease2 * 12);
    }
}
