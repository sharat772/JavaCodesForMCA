import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string ");
        String s1=sc.next();
        System.out.println("original string is "+s1);
        //empty string for reverse
        String res="";
        for(int i=s1.length()-1;i>=0;i--){
            res +=s1.charAt(i);
        }
        //printing reversed string 
        System.out.println("after revrsing string is "+res);
    }
    
}
