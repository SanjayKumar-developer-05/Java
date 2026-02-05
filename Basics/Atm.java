//Encapsulation

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            BankAccount acc = new BankAccount();
            System.out.println("Welcome to Atm ");
            System.out.println("Ypur Balance Account "+acc.getBalance());
            System.out.println("Enter Balance:");
            double balance=sc.nextDouble();
            acc.setBalance(balance);
            System.out.println("Enter Amount:");
            double amount = sc.nextDouble();
            acc.deposit(amount);
            System.out.println("Your Total Balance:"+acc.getBalance());
        }
    }
    
}


class BankAccount{ 
    private double Balance=50000;

    public void  setBalance(double Balance){
        if (Balance>0){
            this.Balance=Balance;
        }
        else{
            System.out.println("Your Balance is Empty");
        }
    }

    public void  deposit(double balance){
        if (balance>0){
            this.Balance+=balance;
            System.out.println("balance Credited Successfully!");
        }
        else{
            System.out.println("Enter Valid balance");
        }  
    }

    public double getBalance(){
        return Balance;
    }

}
