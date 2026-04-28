import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your String");
        String s=sc.nextLine();
        String st=new StringBuilder(s).reverse().toString();
        System.out.println(st);
    }
}
