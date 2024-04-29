import java.util.Scanner;

class BankAccount{
	int balance;
	int previousTranscation;
	String customerName;
	String customerId;
	
	public BankAccount(String cname,String cid) {
		// TODO Auto-generated constructor stub
		customerName=cname;
		customerId =cid;
	}
	
	void deposit(int amount){
		if(amount != 0) {  
			balance = balance+ amount;
			previousTranscation = amount;
		}
	}
	
	void withdraw(int amount) {
		if(amount != 0) {
			balance = balance-amount;
			previousTranscation = -amount;
		}
	}
	
	
	void getPreviousTransaction() {
		if(previousTranscation >0) {
			System.out.println("Deposited: "+ previousTranscation);
		}
		else if(previousTranscation < 0) {
			System.out.println("Withdrawn: "+Math.abs(previousTranscation));
		}
		else {
			System.out.println("No Transaction is Occured! ");
		}
	}
	
	void showMenu() {
		char option ='\0';
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome "+customerName);
		System.out.println("Yout ID is: "+customerId);
		System.out.println();
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. previous Transaction");
		System.out.println("E. Exit");
		
		 do {
			 System.out.println("=============================");
			 System.out.println("Enter the option");
			 System.out.println("=============================");
			 option = sc.next().charAt(0);
			 Character  .toUpperCase(option);
		
		 switch(option) {
		 case 'A':
		 System.out.println("==============================");
		 System.out.println("Balance is: "+balance);
		 System.out.println("==============================");
		 break;
		 case 'B':
			 System.out.println("==============================");
			 System.out.println("Enter the amount to deposit");
			 System.out.println("==============================");
			 int amount=sc.nextInt();
			 deposit(amount);
			 System.out.println();
			 break;
			 
		 case'C':
			 System.out.println("==============================");
			 System.out.println("Enter the amount to withdraw");
			 System.out.println("==============================");
			 int amount2=sc.nextInt();
			 withdraw(amount2);
			 System.out.println();
			 break;
		 case 'D':
			 System.out.println("==============================");
			 getPreviousTransaction();
			 System.out.println("==============================");
			 System.out.println();
			 break;
		 case 'E':
			 System.out.println("==============================");
			break;
			
			default:
			 System.out.println("Invalid Option! Please try again");
			 break;
			 
		    }
		 }while(option != 'E');
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		BankAccount   bank1  =new BankAccount("xyz", "01");
		bank1.showMenu();
	}
}
    

