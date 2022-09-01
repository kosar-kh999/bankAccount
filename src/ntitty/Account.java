package ntitty;

import java.util.Date;

public class Account {
    private AccType accType;
    private String accountNumber;
    private String cardNumber;
    private double balance;
    private int cvv2;
    private Date creatDate;
    private User user;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber.length() == 16) {
            this.accountNumber = accountNumber;
        }
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        if (cardNumber.length() == 16) {
            this.cardNumber = cardNumber;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getCvv2() {
        return cvv2;
    }

    public void setCvv2(int cvv2) {
        if (cvv2 >= 4) {
            this.cvv2 = cvv2;
        }
    }

    public Date getCreatDate() {
        return creatDate;
    }

    public void setCreatDate(Date creatDate) {
        this.creatDate = creatDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isDeposit(double amount){
        if (amount < 0){
            return false;
        }
        balance += amount;
        return true;
    }

    public int withdraw(double money){
        if(money < 0){
            System.out.println("invalid money");
            return 0;
        }
        else if (money > balance){
            System.out.println("not enough money");
            return 0;
        }
        balance -= money;
        return 1;
    }
}
