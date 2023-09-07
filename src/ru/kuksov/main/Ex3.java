package ru.kuksov.main;

import java.lang.reflect.Field;

public class Ex3 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Employee employee = new Employee(10, "Alex", "IT");
        Class employeeClass = employee.getClass();
        Field field = employeeClass.getDeclaredField("salary");

        field.setAccessible(true);
        double salaryValue = (double) field.get(employee);

        System.out.println(salaryValue);

        field.set(employee, 2000);
        System.out.println(employee);
    }
}
