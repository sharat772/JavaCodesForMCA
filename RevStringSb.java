import java.util.Scanner;

public class RevStringSb {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.next();
        StringBuilder sb=new StringBuilder(str);
        //original stringbuilder
        System.out.println("original string builder is "+sb);
        
        for(int i=0;i<=sb.length()/2;i++){
            int front=i;
            int back=sb.length()-1-i;
            
            char frontChar=sb.charAt(front);
            char backChar=sb.charAt(back);
            sb.setCharAt(i, backChar);
            sb.setCharAt(back, frontChar);
        }
        //output
        System.out.println("reversed string of string builder is "+sb);
        //length of string builder is 
        System.out.println("length of string builder is "+sb.length());
        //firstchar of string builder is 
        System.out.println("first char 0 th index is "+sb.charAt(0));
        //substring of stringbuilder from index 1 to 3
        System.out.println("substring of stringbuilder from index 1 to 3 is "+sb.substring(1, 4));
        //setting char 0f 1st index to Z
        sb.setCharAt(1, 'A');
        System.out.println("setting char 0f 1st index to Z is "+sb);
        //append char AA
        System.out.println("append of SB is "+sb.append("AA"));
        
    }
}
