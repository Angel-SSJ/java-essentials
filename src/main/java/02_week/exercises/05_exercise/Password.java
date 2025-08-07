import java.security.SecureRandom;
import java.util.Scanner;
public class Password {
    // List of all possible characters that the password can have
    private static final String CHAR_POOL
            ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+[]{};:'\",./?`~";
    // Password's default length
    private static final int DEFAULT_LENGTH =14;
    // Password's minimum length
    private static final int MIN_LENGTH =8;
    // Variable 'password'
    private String password;
    // Password's Constructor
    public Password(){
        this.password = generatePassword(DEFAULT_LENGTH);
    }
    // Alternative password's constructor to validate its security
    public Password(String password){
        setPassword(password);
    }
    // GETTER
    public String getPassword() {
        return password;
    }
    // SETTER
    public void setPassword(String password) {
        if (isStrong(password, MIN_LENGTH)) {
            this.password = password;
        } else {
            throw new IllegalArgumentException("Password must be strong.");
        }
    }
    // Method to generate a new password
    public static String generatePassword(int length){
        SecureRandom secureRandom = new SecureRandom();
        // It's an algorithm for providing random numbers keeping cryptographically strong, that's to say, the numbers are
        less predictable that class (java.util.Random)
                StringBuilder sb = new StringBuilder();
        // StringBuilder is a mutable sequence of characters, that's to say, it's String, but mutable, providing an efficient way
        to manipulate strings.
        for (int i = 0; i < length; i++) {
            // 'i' take all variables between 0 and length
            int index = secureRandom.nextInt(CHAR_POOL.length());
            // We take a random index from length CHAR_POOL (list of all possible characters)
            sb.append(CHAR_POOL.charAt(index));
            //We add the character belonging to the index (random number taken in the last step)
        }
        return sb.toString();
    }
    // Method to validate password's strength
    public static boolean isStrong(String password){
        // Take the password and test if the password have at least one of the values from each group, this has been done
        using regular expression (regex)
        return password.matches(".*[a-z].*") &&
                password.matches(".*[A-Z].*") &&
                password.matches(".*[0-9].*") &&
                password.matches(".*[!@#$%^&*()\\-_=+\\[\\]{};:'\",./?`~].*");
    }
    // Alternative method to validate password's strength with minimum length
    public static boolean isStrong(String password,int minLength){
        return password.length() >= minLength && isStrong(password);
        // To validate two conditions:
        // -password's length greater that minimum length
        // -If isStrong() return True or False
    }
    // Method main
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Password passwordObj = new Password(); // por defecto
        boolean change = true;
        System.out.print("Creating password");
        for (int i = 0; i < 6; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.print(".");
        }
        System.out.println();
        // buckle while to take any option
        // you exit the buckle until to take option "5"
        while (change) {
            System.out.println("\nOptions:");
            System.out.println(" 1. Create password");
            System.out.println(" 2. Show password");
            System.out.println(" 3. Change password");
            System.out.println(" 4. Check Strength");
            System.out.println(" 5. Exit");
            System.out.print("Answer: ");
            int option = scanner.nextInt();
            // Scan the least line, nextInt() it's a method to scan integer
            // Conditional Statement switch to handle the different options and its respective actions
            switch (option) {
                case 1:
                    System.out.print("Do you desire to generate a random password (1) or write a custom one (2)?\nAnswer: ");
                    int type = scanner.nextInt();
                    // Scan the least line, nextInt() it's a method to scan integer
                    scanner.nextLine();
                    if (type == 1) {
                        passwordObj = new Password();
                        System.out.println("Generated password: " + passwordObj.getPassword());
                    } else if (type == 2) {
                        System.out.print("Enter your custom password: ");
                        String customPassword = scanner.nextLine();
                        // Scan the least line, nextLine() it's a method to scan string
                        try {
                            passwordObj = new Password(customPassword);
                            System.out.println("Password set successfully.");
                        } catch (IllegalArgumentException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    }
                    break;
                case 2:
                    System.out.println("Current password: " + passwordObj.getPassword());
                    break;
                case 3:
                    System.out.print("Enter a new password: ");
                    String nuevaPass = scanner.nextLine();
                    // Scan the least line, nextLine() it's a method to scan string
                    try {
                        passwordObj.setPassword(nuevaPass);
                        System.out.println("Password updated.");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 4:
                    System.out.print("Do you want to check with minimum length? (y/n): ");
                    String resp = scanner.nextLine();
                    // Scan the least line, nextLine() it's a method to scan string
                    if (resp.equalsIgnoreCase("y")) {
                        // We take the option 'y' ignoring if it is uppercase or lowercase
                        System.out.print("What is the minimum length?\nAnswer:");
                        int minLen = scanner.nextInt();
                        scanner.nextLine();
                        // Scan the least line, nextLine() it's a method to scan string
                        System.out.println("Is it strong?: " + isStrong(passwordObj.getPassword(), minLen));
                    } else {
                        System.out.println("Is it strong?: " + isStrong(passwordObj.getPassword()));
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    change = false;
                    // We're breaking out of the loop
                    break ;
                default:
                    System.out.println("Invalid option.");
                    // We show this text if the option is not between validate options(1-5)
            }
        }
        scanner.close();
        // We close this scanner
    }
}