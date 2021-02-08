package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Employee> eList = new ArrayList<>();
        Employee e = new Employee("Сергей", "Попов", 18765, "14.05.2002");
        eList.add(e);
        System.out.println(eList);
    }
}
