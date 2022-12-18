import java.util.Scanner;

public class EmailShowUname {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the mail id");
        String email=sc.next();
        String uname="";
        for(int i=0;i<email.length();i++){
            if(email.charAt(i)=='@'){
                break;
            }else
            {
                uname +=email.charAt(i);
            }
        }
        //output username
        System.out.println("Username is "+uname);
    }
}
