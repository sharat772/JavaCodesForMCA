import java.util.Scanner;

import javax.swing.text.StyleConstants;

public class PlaceTiles {
    //Tiling problem
    public static int placeTiles(int n,int m){
        //only horizontal and vertical placement is possible
        if(n==m)
        return 2;
        //only vertical placemet is possible
        if(n<m)
        return 1;
        //vertical placement + horizontal placement
        return placeTiles(n-m, m)+placeTiles(n-1, m);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter n and m");
        int n=s.nextInt();
        int m=s.nextInt();
        System.out.println("Total number of placements ");
        System.out.println(placeTiles(n, m));
        s.close();
    }
}
