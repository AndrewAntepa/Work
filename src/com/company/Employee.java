package com.company;

import java.util.ArrayList;

public class Employee implements Comparable<Employee>{
    String name = "", surname = "";
    int code;
    String date;

    public Employee (String name, String surname, int code, String date){}

    @Override
    public boolean equals(Object obj) {
        Employee e = (Employee) obj;
        //TODO дописать
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int compareTo(Employee o) {
        //TODO сравнение двух сотрудников

        return 0;
    }
}