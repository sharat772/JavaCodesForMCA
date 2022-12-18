import java.util.Scanner;

public class InsertionSort {

    // printing array
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elemnts of array");
        // taking input to array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // insertion sort in assending order
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            // placement
            arr[j + 1] = current;

        }
        System.out.println("\nInsertion sort assending order ");
        printArray(arr);
        // insertion sort in descending order
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j=i-1;
            while(j>=0 && current>arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            //adding to sorted part of array
            arr[j+1]=current;
        }
        //insertion sort in decending order
        System.out.println("Insertion sort decending order");
        printArray(arr);
    }

}

// 2 1 4 6 7 i=1 and curr = 1 j= 0 1<2 //2 1
//