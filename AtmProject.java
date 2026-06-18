package Test;

import java.util.Scanner;

public class AtmProject {

	public AtmProject() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double balance =10000;
		int choice;
		double amount;
		do {
			System.out.println("\n==ATM MENU===");
			System.out.println("1.Check Balance");
			System.out.println("2. Deposit");
			System.out.println("3.Withdraw");
			System.out.println("4.Exit.");
			System.out.print("Enter choice");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Balance="+balance);
				break;
				
			case 2:
				System.out.println("Enter Amount to Deposit:");
				amount=sc.nextDouble();
				balance=balance+amount;
				System.out.println("amount deposit successful");
				break;
				
			case 3:
				System.out.println("enter amount tp withdraw");
				amount=sc.nextDouble();
				
				if(amount<=balance) {
					balance=balance-amount;
					System.out.println("Amount withdraw succeful");
				}else{
					System.out.println("Insufficient Balance");
				}
				break;
				
			case 4:
				System.out.println("Thank you");
				break;
				
				default:
					System.out.println("invalid choice");
			}
			
		}while(choice !=4);
		
		sc.close();
		
					{
						
					
				}
				
			}
		
	}


