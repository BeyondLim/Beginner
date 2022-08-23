package Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class BankRunner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int operation;
        ArrayList<Integer> accNumber=new ArrayList<Integer>();
        Bank bank=new Bank();
        bank.createAccount();
        accNumber.add(bank.accountNumber);
        bank.balanceEnquiry();

       do{
           System.out.print("Choose particular number of the operation you want to do:\n1:Create Account\n2:Withdrawl\n3:Deposite\n4:Balance Enquiry\n");
           operation=sc.nextInt();
           switch(operation){
               case 1:
                   bank.createAccount();break;
               case 2:
                   bank.withdrawal();break;
               case 3:
                   bank.deposite();break;
               case 4:
                   bank.balanceEnquiry();break;
               default:
                   System.out.println("Invalid Operations:");
           }
       }while (operation<=4);

    }
}
