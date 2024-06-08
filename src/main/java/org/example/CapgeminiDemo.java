/*
package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class CapgeminiDemo {


    public static void main(String[] args) {
        //Get count of all employees for each city in list using java8:
        List<Employee> empList = new ArrayList<Employee>();
        Map<String, Long> result = empList.stream().collect(Collectors.groupingBy(Employee::getCity, Collectors.counting()));

        //using jva1.7:

        Map<String,Long> resultMap = new HashMap<>();
        for(Employee e:empList){
            String city = e.getCity();
            if(resultMap.containsKey(city)){
                resultMap.put(city,resultMap.get(city) +1);
            }resultMap.put(e.getCity(),1);

        }

        empList.stream().collect(Collectors.groupingBy(Employee::getName,Collectors.mapping(Employee::getName,Collectors.toList())));

    }
}
*/
