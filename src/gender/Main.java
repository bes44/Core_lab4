package gender;

/**
 * В класс покупателя добавить перечисление с гендерами, добавить в сотрудника свойство «пол» со значением созданного перечисления.
 * Добавить геттеры, сеттеры.
 */

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Наташа", Gender.FEMALE);
        Employee employee1 = new Employee("Иван", 1, 50000, Gender.MALE);

        System.out.println(customer1);
        System.out.println(employee1);
    }
}
