import java.util.Scanner;

public class Recursion {
    //power stack height =log n
    public static int logNpow(int y,int z){
        if(y==0){
            return 0;
        }
        if(z==0){
            return 1;
        }
        //n is even
        if(z%2==0){
            return (logNpow(y, z/2) * logNpow(y, z/2));
        }else{//n is ood
            return (logNpow(y, z/2)*logNpow(y, z/2) * y);
        }
    }
    //power stack height =n
    public static int yPowerN(int y,int z){
        if(y==0){
            return 0;
        }
        if(z==0){
            return 1;
        }
        int pow=y*(yPowerN(y, z-1));
        return pow;
    }
    public static void fibboSeris(int a,int b,int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.print(c+" ");
        fibboSeris(b, c, n-1);
    }
    public static int calcFact(int n){
        if(n==1||n==0){
            return 1;
        }
        int fact_n=n * (calcFact(n-1));
        return fact_n;
    }
    public static void naturalNumSum(int i,int n,int sum){
        if(i==n){
            sum +=i;
            System.out.println("sum of n natural numbers is "+sum);
            return;
        }
        sum += i;
        naturalNumSum(i+1, n, sum);
    }
    public static void printNum2(int n,int m){
        if(n==m+1){
            return;
        }
        System.out.println(n);
        printNum2(n+1,m);
    }
    public static void printNum(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
            printNum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr n ");
        int n=sc.nextInt();
        printNum(n);
        System.out.println("printing numbers 1 to n");
        printNum2(1,n);
        naturalNumSum(1, n, 0);
        //factorial of n 
        int fact_n = calcFact(n);
        System.out.println("Factorial of "+n+" is "+fact_n);
        //fibonacci series
        System.out.println("Fibonacci Series till nth term");
        if(n==0){
            System.out.println(1);
        }else if(n==1){
            System.out.println("0 1");
        }else{
            System.out.print("0 1 ");
            fibboSeris(0, 1,n-2);
        }
        System.out.println("\nx^n calculation");
        System.out.println("enter the base ");
        int y =sc.nextInt();
        System.out.println("enetr power");
        int z=sc.nextInt();
        int ypowz=yPowerN(y, z);
        System.out.println(ypowz);
        //stack height log n power
        int log_n=logNpow(y,z);
        System.out.println("pow of number log n stack height is "+log_n);
    }
}
