package com.practice.Projects.mayur.checking;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortingTest {

  public static void main(String[] args) {
    Employee employee1 = new Employee("Mayur", 1L);
    Employee employee2 = new Employee("Aman", 2L);
    Department department1 = new Department(1L, "Finance");
    Department department2 = new Department(2L, "Accounts");
    Map<Employee, Department> map = new HashMap<>();
    map.put(employee1, department1);
    map.put(employee2, department2);
    List<Employee> employeeList = Stream.of(employee1, employee2).collect(Collectors.toList());
    List<Department> departmentList =
        Stream.of(department1, department2).collect(Collectors.toList());
    Map<Employee, Department> sortedMap = map.entrySet().stream().sorted(Map.Entry
        .comparingByKey(Comparator.comparing(Employee::getEmpId).thenComparing(Employee::getName)))
        .collect(Collectors
            .toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    System.out.println(sortedMap);
    Map<Employee, Department> sortedByValue = map.entrySet().stream().sorted(Map.Entry
        .comparingByValue(
            Comparator.comparing(Department::getDeptName).thenComparing(Department::getDeptId)))
        .collect(Collectors
            .toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
    System.out.println(sortedByValue);
    employeeList.sort(Comparator.comparing(Employee::getName).thenComparing(Employee::getEmpId));
    System.out.println(employeeList);
    departmentList
        .sort(Comparator.comparing(Department::getDeptId).thenComparing(Department::getDeptName));
    System.out.println(departmentList);

    //map of primitives
    Map<Integer, String> integerStringMap = new HashMap<>();
    integerStringMap.put(1, "One");
    integerStringMap.put(2, "Two");
    integerStringMap.put(3, "Three");
    Map<Integer, String> stringMap =
        integerStringMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors
            .toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    System.out.println(stringMap);

    Map<Integer, String> stringMap2 =
        integerStringMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors
            .toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    System.out.println(stringMap2);

    //array sorting
    Employee[] array = {new Employee("Daniel",1L), new Employee("Chandan",2L),new Employee("Birla",3L), new Employee("Eshwar",4L),new Employee("Abdul",5L)};
    Arrays.sort(array,0,5,Comparator.comparing(Employee::getName).thenComparing(Employee::getEmpId));
    Stream.of(array).forEach(System.out::println);
  }
}
