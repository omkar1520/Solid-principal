package Example2;

import java.math.BigDecimal;

public class CurrentAccount implements Deposit,Withdraw {

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

}
