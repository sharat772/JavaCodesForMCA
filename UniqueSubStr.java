import java.util.HashSet;
import java.util.Scanner;

public class UniqueSubStr {
    // Print all unique subsequences of a string.
    public static void subSequ(String str, int idx, String newStr, HashSet<String> set) {
        if (idx == str.length()) {
            if(set.contains(newStr)){
                return;
            }else{
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        // to be in char
        subSequ(str, idx + 1, newStr + (str.charAt(idx)),set);
        // not be in char
        subSequ(str, idx + 1, newStr,set);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string ");
        String str = sc.next();
        HashSet<String> set = new HashSet<>();
        System.out.println("\n ALL UNIQUE SUBSTRING\n");
        subSequ(str, 0, "", set);
        sc.close();
    }
}
