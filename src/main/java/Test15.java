import org.example.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class Test15 {
    public static void main(String[] args) {

        List<Employee> empList = new ArrayList<>();
        Employee e1 = new Employee(101,"AAA", 13000L);
        Employee e2 = new Employee(102,"BBB", 16000L);
        Employee e3 = new Employee(103,"CCC", 23000L);
        Employee e4 = new Employee(104,"AAA", 28000L);
        Employee e5 = new Employee(105,"EEE", 19000L);
        Employee e6 = new Employee(106,"AAA", 25000L);
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);
        empList.add(e6);

       // empList.stream().filter(e->e.getSalary()>25000L).map(Employee::getName).forEach(System.out::println);

        //empList.stream().map(Employee::getName).collect(Collectors.groupingBy())
 
        /*for(Employee e:empList) {
            String name = e.getName();
            char[] nameArray = name.chars().stream().mapToObj(c->(char)c)


        }*/

        List<Employee>topSalaryEmployees = empList.stream().sorted((emp1,emp2)-> (emp2.getSalary().intValue() - emp1.getSalary().intValue())).limit(3).collect(Collectors.toList());
        //System.out.println(topSalaryEmployees);

        /*find duplicate entries in collection
        method1: using frequency method */
        /*List<String>empNames = empList.stream().map(Employee::getName).collect(Collectors.toList());
        Long repeat = empNames.stream().filter(e-> Collections.frequency(empNames,e)>1).collect(Collectors.counting());
        System.out.println(repeat);*/

         /*find duplicate entries in collection
        method1: using set method */
       /* Set<String> nameSet = new HashSet<>();

        List<String>repeatNames = empList.stream().map(Employee::getName).filter(name->!(nameSet.add(name))).collect(Collectors.toList());
        System.out.println(repeatNames);*/

         /*find duplicate entries in collection
        method1: using map method */
        Map<String,Long>nameMap = empList.stream().collect(Collectors.groupingBy(Employee::getName,Collectors.counting()));
       // System.out.println(nameMap);
        Set<String> repeatedNames = nameMap.keySet().stream().filter(name->nameMap.get(name)>1).collect(Collectors.toSet());
        System.out.println(repeatedNames);

















    }
}
