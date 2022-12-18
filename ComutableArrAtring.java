import java.util.Scanner;

public class ComutableArrAtring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of string u want to input");
        int n=sc.nextInt();
        String arr[]=new String[n];
        System.out.println("enter the strings");
        //input
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        //count length of string and add it to previous length
        //declear a variable to count
        int count=0;
        for(int i=0;i<arr.length;i++){
            count +=arr[i].length();
        }
        //output
        System.out.println("total count of string is "+count);
    }
}
