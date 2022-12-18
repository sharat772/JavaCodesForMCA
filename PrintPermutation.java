import java.util.Scanner;

public class PrintPermutation {
    //Print all the permutations of a string.
    //Time complexity - O(n*n!)
    public static void printPermutation(String str,int idx, String perm){
        if(str.length() == 0){
            System.out.println(perm);
            return;
        }

        for(int i=0;i<str.length();i++){
            char currChar=str.charAt(i);
            String newStr = str.substring(0, i)+str.substring(i+1);
            printPermutation(newStr, idx+1, perm+currChar);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String ");
        String str=sc.next();
        System.out.println("\nALL PERMUTATIONS\n");
        printPermutation(str, 0, "");
        sc.close();
    }
}
