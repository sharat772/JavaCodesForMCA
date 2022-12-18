import java.util.Scanner;

public class MazePathMatrix {
    //Time complexity - O(2^(m+n))
    public static int totPaths(int i,int j,int n,int m){
        if(i==n || j==m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        //move downards + right paths
        return totPaths(i+1, j, n, m) + totPaths(i, j+1, n, m);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows and colums");
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println("\nTotal number of paths is");
        int paths=totPaths(0, 0, n, m);
        System.out.println(paths);
    }
}
