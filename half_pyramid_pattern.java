import java.util.*;
public class half_pyramid_pattern {
    public static void main(_String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j;
        for(i=1;i<=4;i++){
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
