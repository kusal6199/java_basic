import java.util.*;
public class string_predefine_function {
    public static void main(_String[] args) {
        Scanner sc= new Scanner(System.in);
        int i;
        _String firstName="Kushal";
        _String lastName="Kandel";
        _String fullName=firstName+" "+lastName;
        System.out.println("the length of string is");
        System.out.println(fullName.length());//string length function



        //one by one chracter printing function
        for(i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));//function of chracter printing from string   
        }



        //string comparision function
        _String str1="apple";
        _String str2="apple";
        if (str1.compareTo(str2)==0) {
            System.out.println("string are equal");
            
        }
        else{
            System.out.println("string are not equal");
        }
        System.out.println();
        _String a1="Applee";
        _String a2="Kandel";
        if (a1.compareTo(a2)>0) {
            System.out.println(a1+" is grater");//string are compared according to their alphabate position eg. 'A' is smaller then 'Z'  and 'a' is grater then 'Z'
        }
        else
        System.out.println(a2+" is grater");



        sc.close();


    }
    
}
