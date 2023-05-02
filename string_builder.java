import java.util.*;
public class string_builder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        StringBuilder sb = new StringBuilder("Toney");//stringBuilder in java 
        System.out.println(sb);
        sb.setCharAt(0,'M');//set the chracter at given index

        System.out.println(sb);


        sb.insert(0,'S');//string insert function at given index
        System.out.println(sb);
        
        //if we want to delet some part of string then below function is used


        sb.delete(2, 5);//initial sb = SMoney
        System.out.println(sb);//   final sb = Smy

        //string apend in java apend means adding some value at last 

        StringBuilder sbb =new StringBuilder("app");

        sbb.append("le");//app+le
        System.out.println(sbb);//apple
        System.out.println(sbb.length());



        sc.close();
    }
    
}
