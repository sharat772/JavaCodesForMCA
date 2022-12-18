import java.util.Scanner;

public class SpiralTwoDPrint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row number");
        int r= sc.nextInt();
        System.out.println("enter the coumn number");
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        //input
        System.out.println("enter the elements");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        //enterd arry output
        System.out.println("enterd arry is");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        //printing in spiral way
        int rs=0;
        int re=r-1;
        int cs=0;
        int ce=c-1;
        while(rs<=re && cs<=ce){
            for(int col=cs;col<=ce;col++){
                System.out.print(arr[rs][col]+" ");
            }
            rs++;
            for(int row=rs;row<=re;row++){
                System.out.print(arr[row][ce]+" ");
            }
            ce--;
            for(int col=ce;col>=cs;col--){
                System.out.print(arr[re][col]+" ");
            }
            re--;
            for(int row=re;row>=rs;row--){
                System.out.print(arr[row][cs]+" ");
            }
            cs++;
            //System.out.println();
        }
    }
}
