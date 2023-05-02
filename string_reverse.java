import java.util.*;
public class string_reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb = new StringBuilder("kushal");//stringBuilder in java 

        int i;
        for(i=0;i<sb.length()/2;i++){
            int front =i;
            int back = sb.length()-1-i;//6-1-0=5
            char frontChracter=sb.charAt(front);
            char backChracter=sb.charAt(back);
            sb.setCharAt(front, backChracter);
            sb.setCharAt(back, frontChracter);

        }
        System.out.println(sb);

        sc.close();
        
    }
    
}
