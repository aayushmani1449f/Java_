package Encapsulation;

public class Bank {
    private long acc_no;
    private int balance = 5000;

    void deposit(int n) {
        balance = balance + n;
    }

    void withdraw(int n) {
        if (balance < 0) {
            balance = 0;
        } else {
            balance = balance - n;
        }
    }

    public int getbalance() {
        return balance;
    }

    public void setacc_no(long n) {
        acc_no = n;
    }

    public long getacc_no() {
        return acc_no;
    }

    public static void main(String[] args) {

        Bank bank = new Bank();
        bank.setacc_no(664452100);
        System.out.println(bank.getacc_no());
        bank.deposit(2000);
        System.out.println(bank.getbalance());
        bank.withdraw(3000);
        System.out.println(bank.getbalance());

    }
}