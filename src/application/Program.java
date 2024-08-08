package application;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;
import entities.Client;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Client client;

        System.out.println("Enter account number: ");
        int number = sc.nextInt();
        System.out.println("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.println("Is there any initial deposit? y/n");
        char choice = sc.next().charAt(0);
        if (choice == 'y'){
            System.out.println("What will be the value? ");
            double initialDeposit = sc.nextDouble();
             client = new Client(number, holder, initialDeposit);
        } else {
            client = new Client(number, holder);
        }
        System.out.println();


        System.out.println("Account Data:");
        System.out.println(client);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        client.deposit(depositValue);
        System.out.println("Updated account data: ");
        System.out.println(client);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        client.withdraw(withdrawValue);
        System.out.println("Updated account data: ");
        System.out.println(client);






        sc.close();
    }

}
