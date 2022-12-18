import java.util.Scanner;
//Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)
public class Gcd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter n1");
        int n1 = sc.nextInt();
        System.out.println("enter n2");
        int n2=sc.nextInt();
        int gcd=0;
        for(int i=1;i<n1 &&i<=n2;i++){
            if(n1%i==0 && n2%i==0){
                gcd=i;
            }
        }
        System.out.println("GCD of "+n1+" and "+n2+" is "+gcd);
    }
}
