package entities;


public class Client {

    private static final double TAX = 5;

    private int number;
    public String holder;
    public double balance;

    public Client(){

    }

    public Client(int number, String holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Client(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString(){
       return  "Account: "
               + number
               + "Holder: "
               + holder
               + "Balance: "
               + balance;
    }










}












