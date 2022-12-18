import java.util.Scanner;

public class Recursion2 {
    //strictly increasing array O(n)
    public static void strictlyIncreasing(int idx,int a[]){
        if(idx==a.length-1){
            System.out.println("array is stricktly increasing");
            return;
        }
        if(a[idx]<a[idx+1]){
            strictlyIncreasing(idx+1, a);
        }else{
            System.out.println("array is not stricktly increasing");
        }
    }
    public static int front=-1;
    public static int last=-1;
    //Letter occurance check
    public static void letterOccurance(String str1,int idx,char occ){
        if(idx==str1.length()){
            System.out.println("First occurance "+front);
            System.out.println("Last occurance "+last);
            return;
        }
               
        if(occ==str1.charAt(idx)){
            if(front==-1){
                front=idx;
            }else{
                last=idx;
            }
        }
        letterOccurance(str1, idx+1, occ);
    }

    //String reverse
    public static void strRev(String str,int strlen){
        if(strlen==-1){
            return ;
        }
        char s1=str.charAt(strlen);
        System.out.print(s1);
        strRev(str,strlen-1);
        //time complexity O(n)
    }
    public static void towerOfHanoi(int n,String source,String helper,String dest){
        if(n==1){
            System.out.println("Transfer disk "+n+" from "+source+" to "+dest);
            return;
        }
        towerOfHanoi(n-1, source, dest, helper);//dest as helper
        System.out.println("transfer disk "+n+" from "+source+" to "+dest);
        towerOfHanoi(n-1, helper, source, dest);//source as helper
        //time complexity O(2^n)
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of disks");
        int n=sc.nextInt();
        towerOfHanoi(n,"S", "H", "D");
        System.out.println("String revierce using recursion ");
        System.out.println("Enter the string to reverce ");
        String str=sc.next();
        int index=str.length()-1;
        System.out.println("Rev String is ");
        strRev(str, index);
        //Occurance of letter in a string 
        System.out.println("Occurance of letter in a string ");
        System.out.println("Enter string ");
        String str1=sc.next();
        char c='a';
        letterOccurance(str1, 0,c);
        //Array is sorted or not strictly increasing
        System.out.println("enter the size of aray");
        int asize=sc.nextInt();
        int a[]=new int[asize];
        System.out.println("enter arry elements");
        for(int i=0;i<asize;i++){
            a[i]=sc.nextInt();
        }
        int idx=a.length-1;
        strictlyIncreasing(0, a);
        sc.close();
    }
}


