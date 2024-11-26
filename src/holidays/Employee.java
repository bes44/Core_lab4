package holidays;

public class Employee {
    private String name;
    private int id;
    private double salary;
    private Gender gender;

    public Employee(String name, int id, double salary, Gender gender) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', id=" + id + ", salary=" + salary + ", gender=" + gender + '}';
    }

    public static void congratulateEmployees(Employee[] employees, Holiday holiday) {
        for (Employee employee : employees) {
            switch (holiday) {
                case NEW_YEAR:
                    System.out.println("С Новым Годом, " + employee.getName() + "!");
                    break;
                case WOMENS_DAY:
                    if (employee.getGender() == Gender.FEMALE) {
                        System.out.println("С 8 марта, " + employee.getName() + "!");
                    }
                    break;
                case MENS_DAY:
                    if (employee.getGender() == Gender.MALE) {
                        System.out.println("С 23 февраля, " + employee.getName() + "!");
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
