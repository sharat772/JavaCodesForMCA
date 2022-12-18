import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr the row numbers");
        int n= sc.nextInt();
        System.out.println("enetr the colum numbers");
        int m=sc.nextInt();
        int arr[][] =new int[n][m];
        System.out.println("enetr the marix content");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("TRANSPOSE OF MATRIX");

        //transpose of matrix
        for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
/* 1 2 3 4
   5 6 7 8
   9 10 11 12
 */
