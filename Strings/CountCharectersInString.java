package Strings;

public class CountCharectersInString {
    public static void main(String[] args) {
        String str="22AT1A3528";
        int c=0;
        int d=0;
        for(int i=0;i<str.length();i++){
            if((str.charAt(i))>=65){
                c++;
            }else{
                d++;
            }
           
        }
        System.out.println("The total charecters are : "+c);
        System.out.println("The total digits are : "+d);
    }
}
