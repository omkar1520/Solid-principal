package Example1;

import java.math.BigDecimal;

public class CurrentAccount implements Account{

    BigDecimal amount;

    @Override
    public void deposit(BigDecimal amount) {
        this.amount = this.amount.add(amount);
        System.out.println(amount + "Deposited in your account");
    }

    @Override
    public void withdraw(BigDecimal amount) {
        System.out.println(amount + "withdrawn in your current account");
    }

    @Override
    public void annualInterestRateCalculation(BigDecimal amount) {
        throw new UnsupportedOperationException("You cannot cal interest rate as it is current account");
    }
}
