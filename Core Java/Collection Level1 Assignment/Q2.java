import java.io.*;
import java.util.*;
 
class CollectionObjectStorage {
   
    public static void main(String[] args)
    {
        // Instantiate an object of HashSet
        HashSet<ArrayList> set = new HashSet<>();
 
        // create ArrayList list1
        ArrayList<Integer> list1 = new ArrayList<>();
 
        // create ArrayList list2
        ArrayList<Integer> list2 = new ArrayList<>();
      
       // create ArrayList list3
        ArrayList<Integer> list3 = new ArrayList<>();
 
       // create ArrayList list4
        ArrayList<Integer> list4 = new ArrayList<>();
 
       // create ArrayList list5
        ArrayList<Integer> list5 = new ArrayList<>();
 
       // create ArrayList list6
        ArrayList<Integer> list6 = new ArrayList<>();
 
       // create ArrayList list7
        ArrayList<Integer> list7 = new ArrayList<>();
      
      
       // create ArrayList list8
        ArrayList<Integer> list8 = new ArrayList<>();
      
       // create ArrayList list9
        ArrayList<Integer> list9 = new ArrayList<>();
      
       // create ArrayList list10
        ArrayList<Integer> list10 = new ArrayList<>();
 
 
        // Add elements using add method
        list1.add(1);
        list1.add(2);
        list2.add(1);
        list2.add(2);
        list3.add(1);
        list3.add(2);
        list4.add(1);
        list4.add(2);
        list5.add(21);
        list5.add(45);
        list6.add(9);
        list6.add(11);
        list7.add(12);
        list7.add(13);
        list8.add(14);
        list8.add(15);
        list9.add(116);
        list9.add(117);
        list10.add(119);
        list10.add(111);
      
      
        set.add(list1);
        set.add(list2);
        set.add(list3);
        set.add(list4);
        set.add(list5);
        set.add(list6);
        set.add(list7);
        set.add(list8);
        set.add(list9);
        set.add(list10);
        
 // we have added 10 list but list1,list2,list3 and list4 have same value and hashset does not allow duplicacy therefore size will be 7 only
        System.out.println(set.size());
    }
}
