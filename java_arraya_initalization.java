import java.util.*;
public class java_arraya_initalization {
    public static void main(_String args[]){
        Scanner sc =new Scanner(System.in);
        int marks[]={99,98,97}; //1st valid process
        // int[] marks={99,98,97}; 2nd valid process
        // int[] marks=new int[3]; 3rd vailid process
        for(int i=0;i<3;i++){
            System.out.println(marks[i]);
        }
        sc.close(); 

    }
}
