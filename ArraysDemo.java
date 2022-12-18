import java.util.Scanner;

public class ArraysDemo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY");
        int n=sc.nextInt();
        String names[]=new String[n];
        System.out.println("enter names one by one");
        //input
        for(int i=0;i<names.length;i++){
            names[i]=sc.next();
        }
        //output
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }
    }
}
