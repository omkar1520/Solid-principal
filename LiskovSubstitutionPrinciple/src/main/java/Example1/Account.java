package Example1;

import java.math.BigDecimal;

public interface Account {

    void deposit(BigDecimal amount);

    void withdraw(BigDecimal amount) throws IllegalArgumentException;

    void annualInterestRateCalculation (BigDecimal amount);

}
