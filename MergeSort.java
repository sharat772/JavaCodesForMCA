import java.util.Scanner;

public class MergeSort {
    //merge
    public static void merger(int arr[],int s,int mid,int e){
        int merged[]=new int[e-s+1];
        int idx1=s;
        int idx2=mid+1;
        int x=0;
        while(idx1<=mid && idx2<=e){
            if(arr[idx1]<=arr[idx2]){
                merged[x]=arr[idx1];
                x++;
                idx1++;
            }else{
                merged[x++]=arr[idx2++];
            }
        }
        while(idx1<=mid){
            merged[x++]=arr[idx1++];
        }

        while(idx2<=e){
            merged[x++]=arr[idx2++];
        }

        for(int i=0,j=s;i<merged.length;i++,j++){
            arr[j]=merged[i];
        }
    }
    //devide
    public static void devide(int arr[],int s,int e){

        if(s>=e){
            return;
        }
        int mid=(s+e)/2;
        devide(arr, s, mid);
        devide(arr, mid+1, e);
        merger(arr, s, mid, e);

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
        devide(arr, 0, n-1);
        System.out.println("SORTED ARRAY");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }

    }
    
}
