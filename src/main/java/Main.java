import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal: ");
        double subtotal = input.nextDouble();

        System.out.print("Enter the percent of gratuity you would like to leave: ");
        double gratuityRate = input.nextDouble();

        
        double gratuity = subtotal * (gratuityRate / 100);
        double total = subtotal + gratuity;

        
        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
    }
}