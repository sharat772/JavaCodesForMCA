import java.util.*;
public class functions {
        public static void factorial(int n){
            int fact=1;
            for(int i=1;i<=n;i++){
                fact=fact*i;
            }
            System.out.println(fact);
        }

   /*Make a function to check if a number is prime or not.
    Make a function to check if a given number n is even or not.
    Make a function to print the table of a given number n.
    Read about Recursion. */

    /*
     Enter 3 numbers from the user & make a function to print their average.
Write a function to print the sum of all odd numbers from 1 to n.
Write a function which takes in 2 numbers and returns the greater of those two.
Write a function that takes in the radius as input and returns the circumference of a circle.
Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
Write an infinite loop using do while condition.
Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)
Write a program to print Fibonacci series of n terms where n is input by user :
0 1 1 2 3 5 8 13 21 .....
In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
(BONUS)
     */


    //function prime or not
   public static void primeCheck(int n) {
       int m=n/2;
       if(n == 0 || n == 1){
           System.out.println(n+" not a prime number");
           return;
       }
           for(int i=2;i<=m;i++){
               if(n%i == 0){
                   System.out.println(n+" not a prime number");
                   return;
               }
           }
       System.out.println(n+" is a prime number");
   }

   //even or not
   public static void evenOdd(int n) {
       if(n%2 == 0){
           System.out.println(n+" is even");
       }else{
           System.out.println(n+" is odd number");
       }
   }
   // table of a given number
    public static void table(int n){
       for(int i=1;i<=10;i++){
           System.out.println(n+"*"+i+"="+(n*i));
       }
    }

    //Enter 3 numbers from the user & make a function to print their average
    public static void avgNumbers() {
       Scanner sc= new Scanner(System.in);
        System.out.println("enetr n1");
       double n1=sc.nextDouble();
        System.out.println("enetr n2");
       double n2=sc.nextDouble();
        System.out.println("enetr n3");
       double n3=sc.nextDouble();
       double avg;
        avg = (n1+n2+n3)/3;
        System.out.println("AVG of 3 numbers is "+avg);
    }

    //Write a function to print the sum of all odd numbers from 1 to n.
    public static void oddSum(int n) {
       int os=0;
        for(int i=0;i<=n;i++){
            if(i%2 !=0 ){
                os=os+i;
            }else {
                continue;
            }
        }
        System.out.println(os);
    }

    //Write a function which takes in 2 numbers and returns the greater of those two.
    public static void greaterOfTwoNumbers() {
       Scanner sc= new Scanner(System.in);
        System.out.println("enter number 1");
       int g1= sc.nextInt();
        System.out.println("enter number 2");
       int g2= sc.nextInt();
       if(g1>g2){
           System.out.println(g1+" is greater then "+g2);
       }else {
           System.out.println(g2+" is greater then "+g1);
       }
    }

    //Write a function that takes in the radius as input and returns the circumference of a circle.
    public static void circumference() {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the raadius of circle");
        double radius= sc.nextDouble();
        double pi=3.142;
        double circum = 2*pi*radius;
        System.out.println(circum);
    }

    //Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible
    public static void ageCheck(int age) {
       if(age>18){
           System.out.println("vouter is elegible");
       }else {
           System.out.println("vouter is not elegible");
       }
        return;
    }

    //Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros
    public static void userInputNumbers() {
       Scanner sc =new Scanner(System.in);
       int positive=0;
       int negetive =0;
       int zeros =0;
       int con;
       do {
           int ip= sc.nextInt();
           if(ip>0){
               positive++;
           }else if(ip<0){
               negetive++;
           }else{
               zeros++;
           }
           System.out.println("0 to quit 1 to continue");
           con= sc.nextInt();
       }while(con != 0);
        System.out.println("positive numbers enterd is "+positive);
        System.out.println("negetive numbers enterd is "+negetive);
        System.out.println("zeros numbers enterd is "+zeros);

    }

    public static void powerOfNumber() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter base value");
        int x=sc.nextInt();
        System.out.println("enter power value");
        int n= sc.nextInt();
        int res = 1;
        for(int i=1;i<=n;i++){
            res =res * x;
        }
        System.out.println(res);

    }

    public static void main(String args[]){
            Scanner sc =new Scanner(System.in);
            int n=sc.nextInt();
        System.out.println("\nFACTORIAL OF NUMBER");
            factorial(n);
        System.out.println("\nPRIME OR NOT");
            primeCheck(n);
        System.out.println("\nODD OR EVEN CHECK");
            evenOdd(n);
        System.out.println("\nTABLE OF A GIVEN NUMBER");
            table(n);
        System.out.println("\nAVERAGE OF NUMBERS");
        avgNumbers();
        System.out.println("\nODD SUM OF 1 TO N");
        oddSum(n);
        System.out.println("\n GREATEST OF TWO NUMBERS");
        greaterOfTwoNumbers();
        System.out.println("\nCIRCUMFERENCE OF A CIRCLE");
        circumference();
        System.out.println("\nVOTER AGE CHECKING");
        System.out.println("enter the age of the vouter");
        int age= sc.nextInt();
        ageCheck(age);
        System.out.println("\n user input numbers is +ve -ve and 0 count");
        userInputNumbers();
        System.out.println("\nPOWER OF NUMBER ");
        powerOfNumber();
        }
}
