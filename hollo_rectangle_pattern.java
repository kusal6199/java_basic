import java.util.*;
public class hollo_rectangle_pattern {
    public static void main(String[] args) {
        int i,j;
        int m=4,n=5;
        Scanner sc = new Scanner(System.in);
        for(i=1;i<=m;i++){
            for(j=1;j<=n;j++){
                if (i==1||i==m||j==1||j==n) {
                    System.out.print("* ");
                    
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
