import java.util.*;
 class Account {
    int balance=1000;
    String name;
    int acc_no;
    int acc_type;
 }
    public void credit(int amount){
        balance=balance+amount;
        System.out.println("After credit : " + balance);
    }

    public void debit(int amount){
        if(balance - amount >= 1000){
            balance=balance-amount;
            System.out.println("After debit : " + balance);
        }
        else{
            System.out.println("Minimum balance must keep.can't withdraw");
        }
       
    }
	
     public void input(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Name : "); 
        name = sc.nextLine();
        
        System.out.print("Enter Account Number : "); 
        acc_no= sc.nextInt();
        
        System.out.print("Enter Account type : "); 
        acc_type = sc.nextInt();
    }
class main(){
    public static void main(String []args){
        Account acc_1 = new Account();
        acc_1.input();
        acc_1.credit(200);
        acc_1.debit(100);

        Account acc_2 = new Account();
        acc_2.input();
        acc_2.credit(100);
        acc_2.debit(500);
        
    } 
}
