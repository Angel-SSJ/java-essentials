mport java.util.Scanner;
import java.util.UUID;
public class Product {
    // VARIABLES
    private String name;
    private final String id;
    private double price;
    private int stock;
    //CONSTRUCTORS
    // Constructor without stock (stock = 0)
    public Product(String name, double price){
        if (price<=0){
            System.out.println("Price must be greater than 0");
        }
        this.id = UUID.randomUUID().toString();
        // UUID(Universally Unique Identifier) provides an immutable representation of a 128-bit value.
        //We're assigning the default value
        this.name = name;
        this.price = price;
        this.stock = 0;
    }
    // Constructor with stock (stock != 0)
    public Product(String name, double price, int stock) {
        this.stock = stock;
        if (price <= 0) {
            System.out.println("Stock must be positive.");
        }
        this.id = UUID.randomUUID().toString();
        // UUID(Universally Unique Identifier) provides an immutable representation of a 128-bit value.
        //We're assigning the default value
        this.name = name;
        this.price = price;
        this.stock = 0;
    }
    // GETTERS
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getStock() {
        return stock;
    }
    // SETTERS
    public void setPrice(double price) {
        if (price <= 0) {
            System.out.println("Stock must be positive.");
        }
        this.price = price;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setStock(int stock) {
        if (stock < 0) {
            System.out.println("Stock must be positive.");
        }
        this.stock = stock;
    }
    // PRICE STOCK HANDLING
    //Method to normal increase stock
    public void increaseStock(int units) {
        stock += units;
    }
    // Method overload: increase stocks in multiple batches
    public void increaseStock(int[] lotes) {
        for (int lote : lotes) {
            stock += lote;
        }
    }
    //Method to reduce stock
    public void reduceStock(int units) {
        if (units > stock) {
            System.out.println("There aren't enough stock.");
        }
        stock -= units;
    }
    //Method to calculate inventory value
    public double inventoryValue() {
        return price * stock;
    }
    //Method to show product information
    public void showProducto() {
        System.out.println("PRODUCT");
        System.out.println(" ID: " + id);
        System.out.println(" Name: " + name);
        System.out.println(" Price: $" + price);
        System.out.println(" Stock: " + stock);
        System.out.println(" Inventory value: $" + inventoryValue());
    }
    //Method main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Initializing scanner
        System.out.print("Enter the product name: ");
        String name = scanner.nextLine();
        // Scan the least line, nextLine() it's a method to scan string
        System.out.print("Enter the product price: ");
        double price = scanner.nextDouble();
        // Scan the least line, nextDouble() it's a method to scan double
        System.out.print("Enter initial stock (optional, 0 or +1 ): ");
        int stock = scanner.nextInt();
        // Scan the least line, nextInt() it's a method to scan integer
        // Create product by different ways depending on if it has stock or not
        Product product;
        product = (stock == 0) ? new Product(name, price) : new Product(name, price, stock);
        boolean change = true;
        //Conditional statement while to handle the list of possibles options
        while (change) {
            System.out.print("\nOptions\n 1.Create product\n 2.Show item\n 3.Change item\n 4.Show product\n 5.Exit\n
                    Answer: ");
            int option = scanner.nextInt();
            // Scan the least line, nextInt() it's a method to scan integer
            matcher:
            // matcher it´s useful to break a parent buckle
            switch (option) {
                case 1:
                    System.out.print("Enter the product name: ");
                    name = scanner.nextLine();
                    // Scan the least line, nextLine() it's a method to scan string
                    System.out.print("Enter the product price: ");
                    price = scanner.nextDouble();
                    // Scan the least line, nextDouble() it's a method to scan double
                    System.out.print("Enter initial stock (optional, 0 or +1 ): ");
                    stock = scanner.nextInt();
                    // Scan the least line, nextInt() it's a method to scan integer
                    scanner.nextLine(); // Clear buffer
                    // Create product by different ways depending on if it has stock or not
                    product = (stock == 0) ? new Product(name, price) : new Product(name, price, stock);
                    break;
                case 2:
                    System.out.print("What do you want to see?\n 1. Name\n 2. Price\n 3. Stock\n 4. id\n Answer: ");
                    int showOption = scanner.nextInt();
                    // Scan the least line, nextInt() it's a method to scan integer
                    scanner.nextLine(); // Clear buffer
                    switch (showOption) {
                        case 1:
                            System.out.println("Name: " + product.getName());
                            break;
                        case 2:
                            System.out.println("Price: $" + product.getPrice());
                            break;
                        case 3:
                            System.out.println("Stock: " + product.getStock());
                            break;
                        case 4:
                            System.out.println("ID: " + product.getId());
                            break;
                        default:
                            change = false;
                            break matcher;
                        //Breaking the parent buckle from child loop
                    }
                    break;
                case 3:
                    System.out.print("What do you want to change?\n 1. Name\n 2. Price\n 3. Stock\n Answer: ");
                    int changeOption = scanner.nextInt();
                    // Scan the least line, nextInt() it's a method to scan integer
                    scanner.nextLine(); // Clear buffer
                    switch (changeOption) {
                        case 1:
                            System.out.print("Enter the new name: ");
                            String newName = scanner.nextLine();
                            // Scan the least line, nextLine() it's a method to scan string
                            product.setName(newName);
                            break;
                        case 2:
                            System.out.print("Enter the new price: ");
                            double newPrice = scanner.nextDouble();
                            // Scan the least line, nextDouble() it's a method to scan double
                            product.setPrice(newPrice);
                            break;
                        case 3:
                            System.out.print("Do you want to increase or reduce stock? \n 1.Normal increase\n 2.Normal
                                    reduce\n 3.Increase stocks in multiple batches\n 4.Normal set\n Answer: ");
                            int stockOption = scanner.nextInt();
                            // Scan the least line, nextInt() it's a method to scan integer
                            scanner.nextLine(); // Clear buffer
                            int units;
                            switch (stockOption) {
                                case 1:
                                    System.out.print("Enter the number of units(Int): ");
                                    units = scanner.nextInt();
                                    // Scan the least line, nextInt() it's a method to scan integer
                                    product.increaseStock(units);
                                    break;
                                case 2:
                                    System.out.print("Enter the number of units(Int): ");
                                    units = scanner.nextInt();
                                    // Scan the least line, nextInt() it's a method to scan integer
                                    product.reduceStock(units);
                                    break;
                                case 3:
                                    System.out.print("Enter the number of units separated by spaces(Int): ");
                                    String line = scanner.nextLine();
                                    // Scan the least line, nextLine() it's a method to scan string
                                    String[] lotesString = line.split(" "); // Separating by batches every time you find one ' '
                                    int[] lotesArray = new int[lotesString.length];
                                    // We create an int[] with the lotesString's length
                                    for (int i =0; i<lotesString.length; i++){
                                        // 'i' take value between 0 and lotesString's length, and increase 1
                                        lotesArray[i] = Integer.parseInt(lotesString[i]);
                                        // We convert at Integer the value that it's found in lotesString[i]
                                    }
                                    product.increaseStock(lotesArray);
                                    break;
                                case 4:
                                    System.out.print("Enter the number of units(Int): ");
                                    units = scanner.nextInt();
                                    // Scan the least line, nextInt() it's a method to scan integer
                                    product.setStock(units);
                                    break;
                                default:
                                    change = false;
                                    break matcher;
                                //Breaking the parent buckle from child loop
                            }
                            break;
                        default:
                            change = false;
                            break matcher;
                        //Breaking the parent buckle from child loop
                    }
                    break;
                case 4:
                    product.showProducto();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    change = false;
                    // break matcher;
                    // I think that probably matcher it's not necessary here, it's parent loop
                    //Breaking parent loop
            }
        }
        scanner.close();
        // We close this scanner
    }
}