import java.util.Scanner;

public class FriendsPairing {
    //Friends pairing problem
    public static int pairFriends(int n){
        if(n<=1)
        return 1;
        //single single calling + (single + pairs)
        return pairFriends(n-1) + ((n-1)*pairFriends(n-2));

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of friends ");
        int n = s.nextInt();
        System.out.println("Total number of ways to call friends ");
        System.out.println(pairFriends(n));
        s.close();
    }
}
