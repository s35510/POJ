import java.util.Scanner;

public class UseInsurance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter insurance type: ");
        String choice = scanner.nextLine();

        Insurance insurance;

        if (choice.equalsIgnoreCase("Life")) {
            insurance = new Life();
            insurance.display();
        } else if (choice.equalsIgnoreCase("Health")) {
            insurance = new Health();
            insurance.display();
        } else {
            System.out.println("Unknown insurance type.");
        }

        scanner.close();
    }
}