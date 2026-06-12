import java.util.Scanner;

public class CreateLoans {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Loan[] loans = new Loan[5];

        System.out.print("Enter current prime interest rate, for example 5 for 5%: ");
        double primeRate = input.nextDouble();

        for (int i = 0; i < loans.length; i++) {
            System.out.println();
            System.out.println("Loan " + (i + 1));

            System.out.print("Enter loan type (B - business, P - personal): ");
            char loanType = input.next().toUpperCase().charAt(0);

            while (loanType != 'B' && loanType != 'P') {
                System.out.print("Wrong type. Enter B or P: ");
                loanType = input.next().toUpperCase().charAt(0);
            }

            System.out.print("Enter loan number: ");
            int loanNumber = input.nextInt();

            System.out.print("Enter customer last name: ");
            String customerLastName = input.next();

            System.out.print("Enter loan amount: ");
            double loanAmount = input.nextDouble();

            System.out.print("Enter term in years (1, 3, or 5): ");
            int term = input.nextInt();

            if (loanType == 'B') {
                loans[i] = new BusinessLoan(loanNumber, customerLastName, loanAmount, term, primeRate);
            } else {
                loans[i] = new PersonalLoan(loanNumber, customerLastName, loanAmount, term, primeRate);
            }
        }

        System.out.println();
        System.out.println("===== ALL LOANS =====");

        for (int i = 0; i < loans.length; i++) {
            System.out.println();
            System.out.println(loans[i]);
        }

        input.close();
    }
}