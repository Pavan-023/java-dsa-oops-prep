package Strings;

public class Palindrome {
    public static void main(String[] args) {
        String s="RACECAR";
        String reverse="";
        for (int i = s.length()-1; i >=0; i--) {
            reverse+=s.charAt(i);
        }
        if(s.equals(reverse)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println(" NOT Palindrome");
        }
    }
}
