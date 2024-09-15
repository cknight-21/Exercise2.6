import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter subtotal and gratuity rate
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();

        // Calculate gratuity and total
        double gratuity = subtotal * (gratuityRate / 100);
        double total = subtotal + gratuity;

        // Display the results
        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
    }
}