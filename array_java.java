import java.util.*;
public class array_java {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] marks= new int[4];//array of 4 subject marks
        int i,total=0;
        System.out.println("enter marks of 4 subject");
        for(i=0;i<4;i++){
            // System.out.print("Physics: ");
            marks[i]=sc.nextInt();
            total+=marks[i];

        }
        System.out.println("the total marks is "+total);

        sc.close();


    }
    
}
