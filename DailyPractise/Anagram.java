package DailyPractise;

import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        String s="listen";
        String s1="silent";
        char arr[]=s.toCharArray();
        char arr1[]=s1.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        if(Arrays.equals(arr1,arr)){
            System.err.println("T");
        }else{
            System.out.println("F");
        }
    }
}
