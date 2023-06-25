import java.util.*;
public class sum_of_first_natural {
    public static void main(_String args[]){
     Scanner sc=new Scanner(System.in); 
     int i,sum=0,num;  
     System.out.print("enter the last limit natural num: ");  
     num=sc.nextInt();
     for(i=1;i<=num;i++){
        sum+=i;
     }
     System.out.println("final sum: ");
     System.out.println(sum);
     sc.close();
    }
}
