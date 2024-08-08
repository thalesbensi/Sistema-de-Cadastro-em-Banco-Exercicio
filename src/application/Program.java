package application;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;
import entities.Client;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Client client = new Client();

        System.out.println("Enter account number: ");
        int number = sc.nextInt();
        System.out.println("Enter account holder: ");
        String holder = sc.nextLine();
        System.out.println("Is there any initial deposit? y/n");
        String choice = sc.nextLine();
        if (choice == "y"){
            double deposit = sc.nextDouble();
             client = new Client(number, holder, deposit);
        } else if(choice == "n"){
             client = new Client(number, holder);
        } else{
            System.out.println("Insira um valor válido");
        }





        System.out.println("Account Data:");
        System.out.println(client);







        sc.close();
    }

}
