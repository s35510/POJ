public abstract class Loan implements LoanConstants {
    protected int loanNumber;
    protected String customerLastName;
    protected double loanAmount;
    protected double interestRate;
    protected int term;

    public Loan(int loanNumber, String customerLastName, double loanAmount, int term) {
        this.loanNumber = loanNumber;
        this.customerLastName = customerLastName;

        if (loanAmount > MAX_LOAN_AMOUNT) {
            this.loanAmount = MAX_LOAN_AMOUNT;
        } else {
            this.loanAmount = loanAmount;
        }

        if (term == SHORT_TERM || term == MEDIUM_TERM || term == LONG_TERM) {
            this.term = term;
        } else {
            this.term = SHORT_TERM;
        }
    }

    public double calculateLoanFee() {
        return loanAmount * interestRate / 100.0 * term;
    }

    public double calculateTotalAmountOwed() {
        return loanAmount + calculateLoanFee();
    }

    @Override
    public String toString() {
        return "Company: " + COMPANY_NAME + "\n" +
                "Loan type: " + getClass().getSimpleName() + "\n" +
                "Loan number: " + loanNumber + "\n" +
                "Customer last name: " + customerLastName + "\n" +
                "Loan amount: $" + String.format("%.2f", loanAmount) + "\n" +
                "Interest rate: " + String.format("%.2f", interestRate) + "%\n" +
                "Term: " + term + " year(s)\n" +
                "Loan fee: $" + String.format("%.2f", calculateLoanFee()) + "\n" +
                "Total amount owed at due date: $" + String.format("%.2f", calculateTotalAmountOwed());
    }
}