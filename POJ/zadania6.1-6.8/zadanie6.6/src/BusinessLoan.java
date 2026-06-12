public class BusinessLoan extends Loan {
    public BusinessLoan(int loanNumber, String customerLastName, double loanAmount, int term, double primeRate) {
        super(loanNumber, customerLastName, loanAmount, term);
        interestRate = primeRate + 1.0;
    }
}