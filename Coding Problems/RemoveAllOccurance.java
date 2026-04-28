import java.util.ArrayList;
import java.util.Collections;

public class RemoveAllOccurance {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3,3, 4, 2 };
        int remove=2;
        ArrayList<Integer> l = new ArrayList<>();
        for (int i : arr) {
           if(i!=remove){
            l.add(i);
           }
        }
        System.out.println(l);
        Collections.reverse(l);
        
        System.out.println(l);
        System.out.println(l.get(l.size()-2));
    }
}
