package Employees;

import Phone.Phone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class App {
    public static void main(String[] args) {
        ArrayList<Employee> ListEmployee = Employee.addEmployee(10);
        Comparator<Employee> comparatorName = Comparator.comparing(Employee::getName);

        Collections.sort(ListEmployee, comparatorName);
        System.out.println("по имени: " + ListEmployee);

        Collections.sort(ListEmployee, Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName));
        System.out.println("по имени и зп: " + ListEmployee);

       Collections.sort(ListEmployee, Comparator.comparing(Employee::getCompany).thenComparing(Employee::getName).thenComparing(Employee::getSalary));
        System.out.println("по имени, по зп, по компании: " + ListEmployee);

       Collections.sort(ListEmployee, Comparator.comparing(Employee::getAge).thenComparing(Employee::getCompany).thenComparing(Employee::getName).thenComparing(Employee::getSalary));
        System.out.println("по всему: " + ListEmployee);






    }

}
