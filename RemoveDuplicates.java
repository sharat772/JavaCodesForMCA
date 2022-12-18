import java.util.Scanner;

public class RemoveDuplicates {
    public static boolean map[]=new boolean[26];
    //Remove duplicates in a string.
    public static void removeDup(String str,int idx,String newStr){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        if(map[str.charAt(idx)-'a']==true){
            removeDup(str, idx+1, newStr);
        }else{
            newStr += str.charAt(idx);
            map[str.charAt(idx)-'a'] = true;
            removeDup(str, idx+1, newStr);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string ");
        String str=sc.next();
        removeDup(str, 0, "");
        sc.close();
    }
}
