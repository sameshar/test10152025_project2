

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        
        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline
        
        System.out.println("Please enter your location: ");
        String location = scanner.nextLine();
        
        System.out.println("\nYour information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Location: " + location);
        
        scanner.close();
    }
}