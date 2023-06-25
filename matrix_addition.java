import java.util.Scanner;
public class matrix_addition {

    public static void main(_String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat1=new int[3][3];
        int[][] mat2=new int[3][3];

        System.out.println("enter mat 1 element");
        for(int i=0; i<3;i++){
         for(int j=0;j<3;j++){
            mat1[i][j]=sc.nextInt();
        }
    }
        System.out.println("enter mat 2 element");
        for(int i=0; i<3;i++){
         for(int j=0;j<3;j++){
            mat2[i][j]=sc.nextInt();
        }
    }
    int[][] sum= new int[3][3];

    for(int i=0; i<3;i++){
        for(int j=0;j<3;j++){
           sum[i][j]=mat1[i][j]+mat2[i][j];
       }
   }
   System.out.println("the sum of matrix is ");
   for(int i=0;i<3;i++){
    for(int j=0; j<3;j++){
        System.out.print(sum[i][j]+"   ");
    }
    System.out.println();
   }
    sc.close();
    }
}
