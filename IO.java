import java.util.*;
import java.io.*;

class main{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the radius of circle");
       int r=sc.nextInt();
       System.out.println("area of circle is "+ (2*3.142*r));
       System.out.println("enter the number to calculate table");
       int t=sc.nextInt();
       for(int i=1;i<=10;i++)
       {
            System.out.println(t+"*"+i+"="+(i*t));
       }
    }
}