package Example2;

import java.math.BigDecimal;

public class TaxSaverFixedTermDepositAccount implements Deposit,CalculateInterest {

    BigDecimal amount;

    @Override
    public void deposit(BigDecimal amount) {
        this.amount = this.amount.add(amount);
        System.out.println(amount + "Deposited in your account");
    }

    @Override
    public void annualInterestRateCalculation(BigDecimal amount) {
        System.out.println( amount.multiply(BigDecimal.valueOf(0.075)) + "is your estimated interest amount");
    }
}
