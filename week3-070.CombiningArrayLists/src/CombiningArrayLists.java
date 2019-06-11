
import java.util.ArrayList;
import java.util.Collections;

public class CombiningArrayLists {

    public static void main(String[] args) {

        // You can change the values while testing
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();


        list1.add(4);
        list1.add(3);



        list2.add(5);
        list2.add(10);
        list2.add(7);

        combine(list1, list2);

    }
    public static void combine (ArrayList<Integer> one, ArrayList<Integer> two){
        one.addAll(two);
        System.out.println(one);
    }

}
