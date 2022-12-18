import java.util.Scanner;

public class MaxMinArr {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY");
        int n=sc.nextInt();
        int num[]=new int[n];
        System.out.println("enter numbers one by one");
        //input
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            if(num[i]<min){
                min=num[i];
            }
            if(num[i]>max){
                max=num[i];
            }
        }
        System.out.println("minimum value of array is "+min);
        System.out.println("maximum value of array is "+max);
    }
}
