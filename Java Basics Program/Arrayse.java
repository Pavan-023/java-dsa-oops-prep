import java.util.Arrays;
import java.util.Scanner;

class Arrayse{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Srting 1");
        String str1=sc.next();
        System.out.println("Enter your Srting 2");
        String str2=sc.next();
        

        char st1[]=str1.toCharArray();
        char st2[]=str2.toCharArray();
        Arrays.sort(st1);
        Arrays.sort(st2);

        if(Arrays.equals(st1, st2)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not a Anagram");
        }
    }
}