import java.util.Scanner;

public class SubSequence {
    //Print all the subsequences of a string.
    //Time complexity - O(2^n)

    public static void subSequ(String str,int idx,String newStr){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        //to be in char
        subSequ(str, idx+1, newStr + (str.charAt(idx)));
        //not be in char
        subSequ(str, idx+1, newStr);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string ");
        String str=sc.next();
        System.out.println("\nSUB SEQUENCES\n");
        subSequ(str, 0, "");
        sc.close();
    }
}
