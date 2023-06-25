import java.util.*;
public class _2da_array {
    public static void main(_String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j;
        int[][] mat1=new int[3][3];
        int[][] mat2=new int[3][3];
        int[][] sum=new int[3][3];
        System.out.println("enter first matrix elements");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                mat1[i][j]=sc.nextInt();
            }
        }
        System.out.println("\n");
        System.out.println("enter second matrix elements");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                mat2[i][j]=sc.nextInt();
            }
        }
        System.out.println("\n");

        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                sum[i][j]=mat1[i][j]+mat2[i][j];

            }
        }
        System.out.println("the sum of the two matrix is: ");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println("\n");
        }


        sc.close();

    }
    
}
