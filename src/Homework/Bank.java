package Homework;
import java.math.BigDecimal;
import java.util.*;
public class Bank {
    Scanner sc=new Scanner(System.in);
    private String name;
    private int age;
    BigDecimal balance;

    Random rd=new Random();
    int accountNumber=Math.abs(rd.nextInt());

    //int accountNumber=(int)Math.floor(Math.random());


    public void createAccount(){
        System.out.println("To Open Your Account.Do follow Following steps:");
        System.out.println("Enter your full name");
        name=sc.nextLine();
        System.out.println("Enter your age:");
        age=sc.nextInt();
        System.out.println("Enter Balance amount:");
        balance=sc.nextBigDecimal();
    }



    public void withdrawal(){
        System.out.println("Enter Amount to withdrawal:");
        int res;
        int res2=0;
        BigDecimal amount=sc.nextBigDecimal();
        res=balance.compareTo(amount);
       // res2=amount.compareTo();
        if(res==-1) {
            System.out.println("Invalid Operation");
        }
        else{
            balance=balance.subtract(amount);
        }
    }



    public void balanceEnquiry(){
        System.out.println("Account Holder Name: "+name);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Age:"+age);
        System.out.println("Available Balance: "+balance);
    }




    public void deposite(){
        System.out.println("Enter amount you want to deposite: ");
        BigDecimal amount=sc.nextBigDecimal();
        balance=balance.add(amount);
    }


}
