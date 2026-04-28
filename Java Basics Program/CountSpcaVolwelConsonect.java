import java.util.Scanner;

public class CountSpcaVolwelConsonect {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        int sp=0,v=0,c=0;
        s=s.toLowerCase();
        for(char ch :s.toCharArray()){
            if(ch == ' '){
                sp++;
            }
            else if("aeiou".indexOf(ch)!=-1){
                v++;
            }
            else if(ch>='a' && ch<='z'){
                c++;
            }
        }
        System.out.println("Total Spaces are : "+sp);
        System.out.println("Total Consonets are : "+c);
        System.out.println("Total Vowels are : "+v);
    }
}
