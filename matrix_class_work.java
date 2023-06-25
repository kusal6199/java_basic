import java.util.*;
public class matrix_class_work {
    public static void main(_String[] args) {
        Scanner sc= new Scanner(System.in);
        int i,j;
        int mat[][]=new int [3][3];
        System.out.println("enter matrix element :");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.println("enter element at ["+i+"]["+j+"]");
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("matrix is :");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
             System.out.print(mat[i][j]+"  ");
            }
            System.out.println();

        }
    }
}
