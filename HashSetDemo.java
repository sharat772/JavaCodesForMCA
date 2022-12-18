import java.util.HashSet;
import java.util.Iterator;
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(6);
        set.add(2);
        set.add(3);
        set.add(1);
        System.out.println("Size of set"+set.size());
        //print set
        System.out.println(set);
        if(set.contains(1)){
            System.out.println("set contains 1 ");
        }
        Iterator it=set.iterator();

        System.out.println(it.next());
        //using hasNeXt
        System.out.println("Using hasNext");
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //any one method will work simultaniously we cannot perform hasnext
        //hasNext;next
        for(int i=0;i<set.size();i++){
            System.out.println(it.next()); 
        }
    }
}
