import java.util.Scanner;

public class MoveXtoLast {
    ////Move all ‘x’ to the end of the string. - O(n)
    public static void moveAllX(String str,int idx,int count,String newString){
        if(idx==str.length()){
            for(int i=0;i<count;i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        if(str.charAt(idx)=='x'){
            count++;
            moveAllX(str, idx+1, count, newString);
        }else{
            newString += str.charAt(idx);
            moveAllX(str, idx+1, count, newString);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string ");
        String str=sc.next();
        moveAllX(str, 0, 0, "");
        sc.close();
    }
}
