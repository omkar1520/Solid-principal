package Example1;

import java.math.BigDecimal;

public class SavingsAccount implements Account {

    BigDecimal amount;

    @Override
    public void deposit(BigDecimal amount) {
        this.amount = this.amount.add(amount);
        System.out.println(amount + "Deposited in your account");
    }

    @Override
    public void withdraw(BigDecimal amount) {
        this.amount = this.amount.subtract(amount);
        System.out.println(amount + "withdrawn in your account");
    }

    @Override
    public void annualInterestRateCalculation(BigDecimal amount) {
        System.out.println( amount.multiply(BigDecimal.valueOf(0.025)) + "is your estimated interest amount");
    }
}
