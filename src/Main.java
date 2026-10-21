
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Customer> customers = new ArrayList<>();

        // Sample customers
        customers.add(new Customer(
                1, "Thando", "0735529878",
                "thando@email.com", "East London"
        ));

        customers.add(new Customer(
                2, "John", "08255688789",
                "john@email.com", "King William's Town"
        ));

        customers.add(new Customer(
                3, "Sarah", "0734567890",
                "sarah@email.com", "Mdantsane"
        ));

        boolean running = true;

        while (running) {

            System.out.println("\n================================");
            System.out.println("          FLOWSTATE");
            System.out.println("   SMALL BUSINESS MANAGEMENT");
            System.out.println("================================");
            System.out.println("1. Add Customer");
            System.out.println("2. View Customers");
            System.out.println("3. Exit");
            System.out.println("================================");
            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine();

            switch (choice) {

                case "1" -> {
                    System.out.print("Enter customer ID: ");
                    int id = Integer.parseInt(scanner.nextLine());

                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter phone number: ");
                    String phone = scanner.nextLine();

                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();

                    System.out.print("Enter address: ");
                    String address = scanner.nextLine();

                    Customer customer = new Customer(
                            id, name, phone, email, address
                    );

                    customers.add(customer);

                    System.out.println("Customer added successfully!");
                }

                case "2" -> {
                    if (customers.isEmpty()) {
                        System.out.println("No customers found.");
                    } else {
                        System.out.println("\n--- CUSTOMER LIST ---");

                        for (Customer customer : customers) {
                            System.out.println(customer);
                            System.out.println("---------------------");
                        }
                    }
                }

                case "3" -> {
                    running = false;
                    System.out.println("Thank you for using FlowState!");
                }

                default ->
                        System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}