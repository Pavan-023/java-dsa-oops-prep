import java.util.Scanner;

public class Asciival {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Charaecter: ");
        char c= sc.next().charAt(0);
        int val=(int)c;
        System.out.println("Asci value of your "+c+" is "+val);

    }
}
