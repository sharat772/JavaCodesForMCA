public class Patterns {
    public static void main(String args[]){
        //solid rectangle of *
        int n=4;
        int m=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("HOLO RECTANGLE\n");
        //holo rectangle
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(j==1 || i==1 || i==n || j==m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //half pyramid
        System.out.println("LEFT ANGLE TRAINGLE\n");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //inverted pyramid
        System.out.println("INVERTED PYRAMID\n");
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("LEFT ANGLE TRIANGLE OF NUMBERS\n");
        //left angle traingle of numbers
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        //inverted left angle triangle of numbers
        System.out.println("INVERTED TRIANGLE OF NUMBERS\n");
        for(int i=n; i>=1; i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        //right angle triangle
        System.out.println("RIGHT ANGLE TRIANGLE\n");
        for(int i=n;i>=1;i--){
            //inner loop for space
            for(int j=1;j<i;j++){     //   *  space n-1
                System.out.print(" ");   //  **  space n-2
            }                            // ***  space n-3
            //inner loop for *             ****  space n-4
            for(int k=1;k<=(n+1)-i;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        //continuous number pyramid
        System.out.println("CONTINUOUS NUMBER PYRAMID\n");
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }

        //binary digits triangle
        /*  1
            0   1
            1   0   1
            0   1   0   1
         */
        System.out.println("BINARY TRIANGLE\n");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                int s=i+j;
                if(s%2 == 0){
                    System.out.print("1 ");
                }else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        // solid rhombus
        /*
            ****
           ****
          ****
         ****
         */
        System.out.println("SOLID ROMBUS\n");
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //number pyramid
        System.out.println("NUMBER PYRAMID\n");
        for(int i=1;i<=n;i++){
            //innerloop for space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        //palindrome number pyramid
        System.out.println("NUMBER PALINDROME PYRAMID\n");
        for(int i=1;i<=m;i++){
            //spces
            for(int j=1;j<=m-i;j++){
                System.out.print(" ");
            }
            //first half numbers n to 1
            for(int k=i;k>=1;k--){
                System.out.print(k);
            }
            //second half numbers
            for(int l=2;l<=i;l++){
                System.out.print(l);
            }
            System.out.println();
        }
        //butterfly pattern
        System.out.println("BUTTERFLY PATTERN\n");
        //upper part
        for(int i=1;i<=n;i++){
            //first left side
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //second part * right side
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower part inverted
        for(int i=n;i>=1;i--){
            //first left side
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //second part * right side
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //holo rombus
        System.out.println("HOLO ROMBUS\n");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=m;j++){
                if(i==1 || j==1 || i==n || j==m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //diamond patten
        System.out.println("DIAMOND OF * \n");

        //upper part
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //printing * acoording to row numbrs
            for(int j=i;j>=1;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        //lower inverted
        for(int i=n;i>=1;i--){
            //spaces
            for(int j=0;j<=n-i;j++){
                System.out.print(" ");
            }
            //printing * acoording to row numbrs
            for(int j=i;j>=2;j--){
                System.out.print("* ");
            }
            System.out.println();
        }

        //hollow butterfly
        System.out.println("HOLLOW BUTTERFLY\n");
        //upper part
        for(int i=1;i<=n;i++){
            //left part
            for(int j=1;j<=i;j++){
                if(i==1 || j==1 || i==j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            //spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(i==1 || j==1 || i==j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //inverted lowerpart of buttrfly
        for(int i=n;i>=1;i--){
            //left part
            for(int j=1;j<=i;j++){
                if(i==1 || j==1 || i==j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            //spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(i==1 || j==1 || i==j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //half pyramid
        System.out.println("HALF PYRAMID\n");
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        //inverted half pyramid
        System.out.println("INVERTED HALF PYRAMID\n");
        int cc = 1;
        for(int i=n;i>=1;i--){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(cc+" ");
            }
            cc++;
            System.out.println();
        }
    }
}


