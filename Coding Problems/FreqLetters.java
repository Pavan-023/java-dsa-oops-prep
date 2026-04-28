import java.util.Scanner;

public class FreqLetters {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        char []c=s.toCharArray();
        
        for(int i=0;i<c.length;i++){
            int count=1;
            if(c[i]=='/'){
                continue; 
            }for(int j=i+1;j<c.length;j++){
                if(c[i]==c[j]){
                    count++;
                    c[j]='/';
                }
            }
            System.err.println("Charecter "+c[i]+" repeat "+count);
        }
    }
}
