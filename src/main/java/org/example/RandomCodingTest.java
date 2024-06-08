package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RandomCodingTest {

    public static void main(String[] args) {
        List<Employee> gfg = new ArrayList<Employee>() {
            {
                add(new Employee(1,"Geeks1",2000L));
                add(new Employee(2,"Geeks2",5000L));
                add(new Employee(3,"Geeks3",2000L));
            }
        };
        Map<Long, List<String>> collect = gfg.stream().collect(Collectors.groupingBy(Employee::getSalary,Collectors.mapping(Employee::getName,Collectors.toList())));
        System.out.println(collect);


    }
}
