import java.util.ArrayList;
import java.util.Scanner;

public class SubsetOfSet {
    //printing subset
    public static void printSet(ArrayList <Integer> subset){
        for(int i=0;i<subset.size();i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    //Subsets of a set
    public static void subsetOfSet(int n,ArrayList <Integer> subset){

        if(n==0){
            printSet(subset);
            return;
        }

        //elements wants to add
        subsetOfSet(n-1, subset);
        subset.add(n);

        //elemets dont want to add
        subsetOfSet(n-1, subset);
        subset.remove(subset.size()-1);
        

    }
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter n ");
        int n = s.nextInt();
        ArrayList <Integer> subset =new ArrayList<>();
        System.out.println("Subsets of set of natural number till N ");
        subsetOfSet(n, subset);
        s.close();
    }
}
