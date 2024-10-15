package Employee;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class MySetOfEmployee
{
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Ram", 40000);
        Employee emp2 = new Employee(102, "Rohan", 50000);
        Employee emp3 = new Employee(103, "Radha", 409000);
        Employee emp4 = new Employee(104, "Mohan", 90000);
        Employee emp5 = new Employee(101, "Ram", 40000);


       // Set<Employee> set = new HashSet<>();  // it doesnot follow the insertion order
        Set<Employee> set = new LinkedHashSet<>();  // follow the insertion order
        set.add(emp1);
        set.add(emp2);
        set.add(emp3);
        set.add(emp4);
        System.out.println(set);

        for (Employee emp: set)
        {
            System.out.println(emp);
        }
    }
}
