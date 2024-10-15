package Employee;

import java.util.*;

public class MyListEmployee
{

    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Ram", 40000);
        Employee emp2 = new Employee(102, "Rohan", 50000);
        Employee emp3 = new Employee(103, "Radha", 409000);
        Employee emp4 = new Employee(104, "Mohan", 90000);
        Employee emp5 = new Employee(101, "Sita", 40000);

        //List<Employee> list = new ArrayList<>();
        List<Employee> list = new LinkedList<>();
        //Set<Employee> list = new HashSet<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        System.out.println(list);

        for (Employee emp: list)
        {
            System.out.println(emp);
        }

    }
}
