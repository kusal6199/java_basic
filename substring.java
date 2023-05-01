import java.util.*;


public class substring{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence="My name is Kushal";
        //substring vanako string ko kunai part
        String part=sentence.substring(11,sentence.length());
        System.out.println(part);
        
    
        sc.close();
        
    }
}