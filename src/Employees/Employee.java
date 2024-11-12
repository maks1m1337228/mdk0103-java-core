package Employees;

import java.util.ArrayList;
import java.util.Random;

public class Employee {
    public String name;
    public int salary;
    public String company;
    public int age;

    public Employee(String name, int salary, String company, int age) {
        this.name = name;
        this.salary = salary;
        this.company = company;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getCompany() {
        return company;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", company='" + company + '\'' +
                ", age=" + age +
                '}';
    }



    public static ArrayList<Employee> addEmployee(int count) {
        ArrayList<Employee> employees = new ArrayList<>();
        String[] names = {"AEgor",  "Albert", "AMax", "ALuna", "ARamzik", "Azamat", "AGeorge", "APeppa", "ADonatello", "ARafaello"};
        String[] companies = {"Apple",  "Microsoft", "Valve", "Sber", "Gazprom", "ZBank", "FutureSimple", "Zeon", "Izhorskiy Zavod", "Blagie Dela"};
        int[] salaries = {3000,  700, 1200, 40, 300, 2000, 2700, 7500, 100, 10000};
        Random random = new Random();
        for (int i = 0; i < count && i < names.length; i++) {
            String name = names[i];
            int salary = salaries[i];

            String company = companies[i];
            int age = random.nextInt(21, 60);
            employees.add(new Employee(name, salary, company, age)); // Add employee
        }

        return employees;
    }
}

