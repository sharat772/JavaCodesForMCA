import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.xml.transform.SourceLocator;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> student=new HashMap<>();
        student.put(01, "Sharat");
        student.put(02, "Hegde");
        student.put(03, "Groot");
        student.put(03, "Groot Reborn");//replces value orupdates value if already key is exist
        System.out.println(student);
        //search 
        if(student.containsKey(2)){
            System.out.println("KEy is present");
        }else{
            System.out.println("Key is not in student HashMap");
        }
        if(student.containsKey(5)){
            System.out.println("KEy is present");
        }else{
            System.out.println("Key is not in student HashMap");
        }
        System.out.println(student.get(3)); //key exsit
        System.out.println(student.get(6)); //dosentot exist
        int arr[]={1,2,3,4,5};
        //different for loop
        // for(int val:arr){
        //     System.out.print(val+" ");
        // }
        // System.out.println();

        //Iteration of HashMap
        for(Map.Entry<Integer, String> e:student.entrySet()){
            System.out.print(e.getKey()+"-> ");
            System.out.println(e.getValue());
        }

        // for(Map.Entry<Integer,String>e:student.entrySet())
        Set<Integer> keys=student.keySet();
        for(Integer key: keys ){
            System.out.println(key+" "+student.get(key));
        }

        //removing in HAshmap
        student.remove(2);
        System.out.println(student);
    }
}
