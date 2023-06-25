
import java.util.Scanner;
public class Employe{
   int emp_id;
   _String full_name;
   double salary;  
   Scanner sc = new Scanner(System.in);
   void read_data(){
    
   System.out.println("enter the employee id: ");
   emp_id=sc.nextInt();
   System.out.println("enter the full name: ");
   full_name=sc.next();
   System.out.println("enter the slary: ");
   salary=sc.nextDouble();
   sc.close();
   }
   double calculateTax(double tax_rate)
   {
    // System.out.println("enter the rate: ");
    // tax_rate = sc.nextDouble();
    double tax_amount = ((salary*12)/(tax_rate/100));
    return tax_amount;
   }

   void view_data(){
    System.out.println("the employee details");
    System.out.println("employee id = "+ emp_id);
    System.out.println("full name= "+ full_name);
    System.out.println("slaary = "+ salary);
    // System.out.println("Tax amount= "+ tax_amount);
}
}

