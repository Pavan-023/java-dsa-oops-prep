package Strings;

public class SwapFirstAndLastLetter {
    public static void main(String[] args) {
        String str="HELLO";
        char first=str.charAt(0);
        char last= str.charAt(str.length()-1);
        String middle=str.substring(1, str.length()-2);
        String swap=last+middle+first;
        System.out.println(swap);
    }
}
