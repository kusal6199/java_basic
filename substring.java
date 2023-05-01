import java.util.*;


public class substring{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence="My name is Kushal";
        //substring vanako string ko kunai part
        String part=sentence.substring(11,sentence.length());
        System.out.println(part);
        //string_name.substring(beginingIndex:11,endingIndex:16)---> return string part begining from index 11 and upto index 15 only index 16 chracter is excluded
        
    
        sc.close();
        
    }
}