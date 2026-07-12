import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number for the table: ");
        int num = scanner.nextInt();
        
        System.out.print("How many times do you want to multiply it? ");
        int limit = scanner.nextInt();
        
        System.out.println("\nMultiplication Table for " + num + " up to " + limit + ":");
        
        for (int i = 1; i <= limit; i++) {
            System.out.printf("%d x %d = %d\n", num, i, num * i);
        }
        
        scanner.close();
    }
}
