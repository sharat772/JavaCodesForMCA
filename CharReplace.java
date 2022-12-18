import java.util.Scanner;

public class CharReplace {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enetr the string");
        String res="";
        String s1=sc.next();
        System.out.println("before edit "+s1);
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)=='e'){
                res+='i';
            }else{
                res+=s1.charAt(i);
            }
        }
        //output
        System.out.println("the modified string is "+res);
    }
}
