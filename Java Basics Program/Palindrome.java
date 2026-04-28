import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter your String");
        String s=sc.nextLine();
        int l=0,r=s.length()-1;
        while (l<r) {
            if(s.charAt(l)!=s.charAt(r)){
                System.out.println("NOT A Palindrome");
                return;
            }
            l++;
            r--;
        }
        System.out.println("Palindrome");
    }
}
