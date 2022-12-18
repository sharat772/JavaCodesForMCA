import java.util.Scanner;

public class conditions {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a");
        int a=sc.nextInt();
        System.out.println("enter b");
        int b=sc.nextInt();
        int op;
        do {
            System.out.println("1:addition\n2:subtraction\n3:multiplication\n4:division\n5:reminder");
            op=sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("additon of a and b is " + (a + b));
                    break;
                case 2:
                    System.out.println("subtraction of two numbers " + (a - b));
                   break;
                case 3:
                    System.out.println("multiplication of two numbers " + (a * b));
                    break;
                case 4:
                    System.out.println("division of two numbers " + (a / b));
                    break;
                case 5:
                    System.out.println("reminder of two numbers " + (a % b));
                    break;
                case 6:
                    System.out.println("exit");
                    return;
                default:
                    System.out.println("enter correct option");
            }
        }while(op!=6);
    }
}
