package holidays;

public class Manager extends Employee {


    public Manager(String name, int id, double salary, Gender gender) {
        super(name, id, salary, gender);
    }

    public static void raiseSalaries(Employee[] employees, double amount) {
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                employee.setSalary(employee.getSalary() + amount);
            }
        }
    }
}
