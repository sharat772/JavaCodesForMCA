import java.util.Scanner;

public class QuickSort {
    //partition
    public static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                //swap
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }//for last swap pivot 
        i++;
        int temp=pivot;
        arr[high]=arr[i];
        arr[i]=temp;
        return i;

    }
    //Quick sort function
    public static void quickSort(int arr[],int low,int high){
        if(low<high){
            int pidx = partition(arr,low,high);
            quickSort(arr, low, pidx-1);
            quickSort(arr, pidx+1, high);
        }  
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of elements ");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        quickSort(arr, 0, n-1);
        System.out.println("SORTED ARRAY");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
