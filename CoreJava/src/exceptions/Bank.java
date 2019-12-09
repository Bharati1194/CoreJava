package exceptions;

import java.util.Scanner;

class InsufficientFundTransferException extends RuntimeException
{
	public InsufficientFundTransferException(String msg){
		super(msg);
	}
}

public class Bank {
	
	int Balance=10000;

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your withdraw amount ? ");
		double withdraw =sc.nextDouble();
		if(withdraw<=10000)
			System.out.println("print the balance amount");
		else if(withdraw>10000)
		{
			throw new InsufficientFundTransferException("No funds are available");
		}
		
	}

}
