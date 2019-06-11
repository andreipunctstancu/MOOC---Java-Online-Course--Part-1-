import java.util.ArrayList;

public class Variance {

    public static int sum(ArrayList<Integer> list) {
        int total = 0;
        for (int i = 0; i < list.size(); i++) {
            total += list.get(i);
        }
        return total;
    }

    public static double average(ArrayList<Integer> list) {

        return (double) sum(list)/list.size();
    }

    public static double variance(ArrayList<Integer> list) {
        int i = 0;
        while (i<list.size()){
            list.get(i);
            i++;
        }
        return (double) () ;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
