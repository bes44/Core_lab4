package holidays;

/**
 * Добавить в основную программу перечисление с праздниками (нет праздника, Новый Год, 8 марта, 23 февраля), написать метод,
 * принимающий массив сотрудников, поздравляющий всех сотрудников с Новым Годом, женщин с 8 марта, а мужчин с 23 февраля,
 * если сегодня соответствующий день.
 */

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Наташа Иванова", 1, 150000,Gender.FEMALE);
        Employee emp2 = new Employee("Иван Сотрудников", 2, 155000, Gender.MALE);
        Manager mgr1 = new Manager("Вячеслав Руководителев", 3, 160000, Gender.OTHER);

        Employee[] employees = {emp1, emp2, mgr1};

        System.out.println("Сегодня Новый Год:");
        Employee.congratulateEmployees(employees, Holiday.NEW_YEAR);

        System.out.println("\nСегодня 8 марта:");
        Employee.congratulateEmployees(employees, Holiday.WOMENS_DAY);

        System.out.println("\nСегодня 23 февраля:");
        Employee.congratulateEmployees(employees, Holiday.MENS_DAY);
    }
}
