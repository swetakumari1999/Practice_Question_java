import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.*;

// Class customer order
class Order {
    String customer;
    double amount;
    LocalDate date;

    public Order(String customer, double amount, String date) {
        this.customer = customer;
        this.amount = amount;
        this.date = LocalDate.parse(date);
    }
}

// Class total amount per customer
class TotalCustomer {
    String customer;
    double totalAmount;

    TotalCustomer(String customer, double totalAmount) {
        this.customer = customer;
        this.totalAmount = totalAmount;
    }
}

// Class filtering orders
class FilterOrder {
    public List<TotalCustomer> fetchTop3Customers(List<Order> orders) {
        LocalDate aYearBefore = LocalDate.now().minusYears(1);
       /* Map<String, Double> totalCustomers = new HashMap<>();

        // Calculate total amounts and apply discounts
        for (Order order : orders) {
            double amount = order.amount;

            if (order.date.isBefore(aYearBefore)) {
                amount *= 0.9;
            }


            totalCustomers.put(order.customer, totalCustomers.getOrDefault(order.customer, 0.0) + amount);
        }

        List<TotalCustomer> customerTotalList = new ArrayList<>();
        for (Map.Entry<String, Double> entry : totalCustomers.entrySet()) {
            customerTotalList.add(new TotalCustomer(entry.getKey(), entry.getValue()));
        }

        // Sort by total amount and get top 3 customers
        customerTotalList.sort((c1, c2) -> Double.compare(c2.totalAmount, c1.totalAmount));

        return customerTotalList.size() > 3 ? customerTotalList.subList(0, 3) : customerTotalList;
    */


        return orders.stream().collect(Collectors.groupingBy(
                order -> order.customer, Collectors.summingDouble(order -> {
                    double amount = order.amount;
                    if(order.date.isBefore(aYearBefore)) {
                        amount *= 0.9;
                    }
                    return amount;
    })
    ))
            .entrySet().stream()
    .map(entry -> new TotalCustomer(entry.getKey(), entry.getValue()))
                .sorted((c1, c2) -> Double.compare(c2.totalAmount, c1.totalAmount))
                    .limit(3) // Get top 3 customers
                .collect(Collectors.toList());
}
}
// Main class to run the program
public class ECommerceProject {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order("Alice", 1200, "2022-05-20"),
                new Order("Bob", 1500, "2024-03-10"),
                new Order("Charlie", 1100, "2020-12-25"),
                new Order("Diana", 1800, "2022-01-12"),
                new Order("Eve", 700, "2024-07-05")
        );

        FilterOrder fo = new FilterOrder();
        List<TotalCustomer> topCustomers = fo.fetchTop3Customers(orders);

        for (TotalCustomer tc : topCustomers) {
            System.out.println("Customer: " + tc.customer + " Total Amount: " + tc.totalAmount);
        }
    }
}
