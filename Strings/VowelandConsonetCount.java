package Strings;


import java.util.Set;
import java.util.TreeSet;

public class VowelandConsonetCount {
    public static void main(String[] args) {
        String str = "Welcome";

        int v = 0, c = 0;
        str.toLowerCase();
        Set<Character> set = new TreeSet<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'i' || ch == 'o' || ch == 'e' || ch == 'u') {
                set.add(ch);
                v++;
            } else {
                set.add(ch);
                c++;
            }
        }
        System.out.println(set);
        System.out.println(c);
        System.out.println(v);
    }
}
