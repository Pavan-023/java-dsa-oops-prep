import java.util.*;

public class DupInSet {
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 2, 4};
        Set<Integer> s= new HashSet<>();
        for(int i: arr){
            s.add(i);
        } if(arr.length==s.size()){
            System.out.println("false");
        }else{
            System.out.println("true");
        }
        String st="banana";
        Set<Character> ch=new HashSet<>();
        for(char c:st.toCharArray()){
            ch.add(c);
            System.err.println(ch);

        }
        System.err.println(ch);
        int a[]={1, 2};
        int b[]={1,2,3};
        // Set<Integer> i=new HashSet<>();
        Set<Integer> a1=new HashSet<>();
        for(int i:a){
            a1.add(i);
        }
        Set<Integer> a2=new HashSet<>();
        for(int i:b){
            a2.add(i);
        }
        if(a2.containsAll(a2)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }


    }
}
