import java.util.Scanner;

public class AssedingCheck {
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
        boolean flag=true;
        for(int i=0;i<num.length-1;i++){
            if(num[i]>num[i+1]){
                flag=false;
            }
        }
        if(flag == true){
            System.out.println("array is in assending order");
        }else{
            System.out.println("not in assending order");
        }
    }
}
