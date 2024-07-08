package streamschatgpt;

import org.example.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class StreamCodingExample {

    /*Given a list of Person objects, where Person has name (String) and age (int),
    write a method to filter out people younger than 20 and
    sort the remaining people by their names in reverse order.*/

    public static void main(String[] args) {
        /*List<Person>persons = new ArrayList<>(Arrays.asList(new Person("priya",9),
                new Person("raghu",10),
                new Person("rrr",37),
                new Person("eee",15),
                new Person("ddd",25),
                new Person("yyy",20),
                new Person("vvv",19)));

        filterAndSort(persons);*/

        /*2.Given a list of Transaction objects where Transaction has id (String)
                and amount (double), write a method to group transactions
        by their id and count how many transactions each id has.*/

        /*List<Transaction>txs=new ArrayList<>(Arrays.asList(
                new Transaction("1231",54),
                new Transaction("34543",76),
                new Transaction("353",65),
                new Transaction("435435",45),
                new Transaction("745",77),
                new Transaction("234234",222),
                new Transaction("5435",343),
                new Transaction("2342",234),
                new Transaction("3453",4353),
                new Transaction("456546",234),
                new Transaction("34525",2344)));

        groupByTxId(txs);*/

        /* 3.Given a list of Employee objects where Employee has id (int)
                and name (String), write a method to find all duplicate id values.*/

       /* List<Employee>emps = new ArrayList<>(Arrays.asList(
                new Employee(21,"aaaa",25000L),
                new Employee(32,"wrewr",35000L),
                new Employee(343,"aaaa",3423L),
                new Employee(656,"zxczxc",4234L),
                new Employee(67,"sdfds",25000L),
                new Employee(27,"bvcbcv",25000L),
                new Employee(453,"aaaa",25000L),
                new Employee(232,"dfgfdg",25000L),
                new Employee(26,"aaaa",25000L),
                new Employee(878,"asfa",25000L),
                new Employee(25,"wer",25000L),
                new Employee(567,"aaaa",25000L)

        ));

        duplicateNames(emps);*/

      /* 4. Given a list of lists of Integer objects, write a method to flatten the list and remove any duplicates.*/
       /* List<Integer>l1 = Arrays.asList(2,5,3,7,4,3);
        List<Integer>l2 = Arrays.asList(6,84,9324,0,104,23);
        List<Integer>l3 = Arrays.asList(4,3,9,6,2,90,345,33);
        List<Integer> collect = Stream.of(l1, l2, l3).flatMap(Collection::stream).distinct().collect(Collectors.toList());
        System.out.println(collect);*/

       /* 5.find the nth highest salary from a hashmap--java techie question*/
        Map<String,Integer>empMap  = new HashMap<>();
        empMap.put("priya",1500);
        empMap.put("adhya",1600);
        empMap.put("maria",7000);
        empMap.put("nancy",1000);
        empMap.put("sharon",6800);
        empMap.put("riddhi",2300);
        empMap.put("raghav",7000);
        empMap.put("john",5000);
        empMap.put("james",3434);

        //findNthHighestSalaryWithoutSalaryDuplicate(2,empMap);
        findNthHighestSalaryWithSalaryDuplicate(2,empMap);









    }

    public static void findNthHighestSalaryWithoutSalaryDuplicate(int n,Map<String,Integer>empMap){
        Map.Entry<String, Integer> stringIntegerEntry = empMap.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(Collectors.toList()).get(n - 1);
        System.out.println(stringIntegerEntry);
    }

    public static void findNthHighestSalaryWithSalaryDuplicate(int n,Map<String,Integer>empMap){
        Map<Integer, List<String>> collect = empMap.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList())));
        Map.Entry<Integer, List<String>> integerListEntry = collect.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).collect(Collectors.toList()).get(n-1);
        System.out.println(integerListEntry);
    }

    public static void duplicateNames(List<Employee>emps){
        /*Map<String, List<Integer>> collect = emps.stream().collect(Collectors.groupingBy(Employee::getName, Collectors.mapping(Employee::getId, Collectors.toList())));
        List<List<Integer>> collect1 = collect.entrySet().stream().filter(entry -> entry.getValue().size() > 1).map(Map.Entry::getValue).collect(Collectors.toList());
        System.out.println(collect1);*/
        Map<Integer, List<String>> collect2 = emps.stream().collect(Collectors.groupingBy(Employee::getId, Collectors.mapping(Employee::getName, Collectors.toList())));
        Map<Integer, String> collect = emps.stream().collect(Collectors.toMap(Employee::getId, Employee::getName));
        System.out.println(collect2);
        System.out.println(collect);
    }

    public static void filterAndSort(List<Person>persons){
        persons.stream().filter(p->p.getAge()>20)
                .sorted(Collections.reverseOrder(Comparator.comparing(Person::getName)))
                        .forEach(System.out::println);


    }

    public static void groupByTxId(List<Transaction>txs){
        Map<String, Long> collect = txs.stream().collect(Collectors.groupingBy(Transaction::getId, Collectors.counting()));
        System.out.println(collect);
    }


}
