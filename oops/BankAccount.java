package Java;
import java.util.Scanner;
public class BankAccount {
    public double amount;
    public double deposit(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter deposit amount");
        double a=sc.nextInt();
        amount+=a;
        return amount;
    }
    public void withdrawn(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter withdrawal amount");
        int c=sc.nextInt();
        if(c<=amount)
        {
            amount-=c;
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    public double display(){
        System.out.println("Total balance");
        return amount;
    }
}
class Main{
    public static void main(String[] args){
        BankAccount account=new BankAccount();
        account.amount=20000;
        System.out.println(account.deposit());
        account.withdrawn();
        System.out.println(account.display());
    }
}
