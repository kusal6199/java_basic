import java.util.*;
public class permutation {
    public static void perm(String str,String permutation){
        if (str.length()==0) {
            System.out.println(permutation);
            return;

            
        }
        for(int i=0;i<str.length();i++){
            char curChar=str.charAt(i);
            String newStr=str.substring(0, i)+str.substring(i+1, str.length());
            perm(newStr, permutation+curChar);

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter string to find permutation: ");
        String str=sc.nextLine();
        perm(str, "");

        sc.close();
    }
    
}
