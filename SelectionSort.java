import java.util.Scanner;

public class SelectionSort {
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
        // Selection sort assending order
        for (int i = 0; i < arr.length - 1; i++) {
            int sindex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[sindex]) {
                    sindex = j;
                }
            }
            // swaping iterations end point
            int temp = arr[i];
            arr[i] = arr[sindex];
            arr[sindex] = temp;
        }
        //calling printArray function
        System.out.println("Selection sort assending order ");
        printArray(arr);

        //Selection sort desending order
        for (int i = 0; i < arr.length - 1; i++) {
            int bindex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]>arr[bindex]) {
                    bindex = j;
                }
            }
            // swaping iterations end point
            int temp = arr[i];
            arr[i] = arr[bindex];
            arr[bindex] = temp;
        }
        //calling printArray function
        System.out.println("\nSelection sort descendig order ");
        printArray(arr);
        sc.close();
    }
}
