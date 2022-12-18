import java.util.Scanner;

public class loops {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        int ch;
        do {
            System.out.println("enter ur choice\n 1:enetr marks \n0:exit");
             ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("enter marks");
                    int mark = sc.nextInt();
                    if (mark >= 90)
                        System.out.println("this is good");
                    else if (mark < 90 && mark >= 60)
                        System.out.println("this also good");
                    else if (mark < 60 && mark >= 30)
                        System.out.println("that also good needs effort");
                    else
                        System.out.println("dont loose hope");
                    break;
            }
        } while (ch != 0);
    }
}
