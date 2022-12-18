import java.util.Scanner;
//Write a program to print Fibonacci series of n terms where n is input by user :
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int a=0;
        int b=1;
        int c=0;
        System.out.print(a+" "+b);//printing starting 0 and 1
        for(int i=2;i<n;i++){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}
