/**
 * 
 */
package practicesession;

import java.util.Scanner;

public class Empmainmethod {
	
static String emm;


	
public static void main(String[] args) {
	
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Empmainmethod"+"\n"+"1.PartTimeEmployee"+"\n"+"2.FullTimeEmployee");
	 int process=sc.nextInt();
	 if(process==2){
		Employee emp=new FullTimeEmployee();
		emm="FullTimeEmployee";
		emp.CalcSalary();
		
	 }else if(process==1){
		 Employee emp=new PartTimeEmployee();
			emm="PartTimeEmployee";
			emp.CalcSalary();
			
	 }
	 
}
	
/*	PartTimeEmployee parttimeemp = new PartTimeEmployee();
	FullTimeEmployee fulltimeemp = new FullTimeEmployee();
	
			
   Scanner sc= new Scanner(System.in);

   System.out.println("-----------------------------");
   System.out.println("Types Of Employees"); 
   System.out.println("-----------------------------");
   System.out.println(" Part Time Employee ");
   System.out.println(" Full Time Employee ");
   System.out.println(" EXIT ");
   System.out.println("-----------------------------");
   System.out.println("select your choice ?");
   int choice = sc.nextInt();
   switch(choice)
   {
   case 1:System.out.println("Enter the type of Employee ?");
   }
}*/

	

}