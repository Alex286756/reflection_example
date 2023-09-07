package ru.kuksov.main;

import java.lang.reflect.Field;

public class Ex1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class employeeClass = Class.forName("ru.kuksov.main.Employee");
//        Class employeeClass2 = Employee.class;
//
//        Employee emp = new Employee();
//        Class employeeClass3 = emp.getClass();

        Field someField= employeeClass.getField("id");
        System.out.println(("Type of id field = " + someField.getType()));
        System.out.println("*****");
        Field[] fields = employeeClass.getFields();
        for (Field field: fields){
            System.out.println("Type of " + field.getName() + " = " + field.getType());
        }

        System.out.println("*****");
        Field[] allFields = employeeClass.getDeclaredFields();
        for (Field field: allFields){
            System.out.println("Type of " + field.getName() + " = " + field.getType());
        }
    }
}
