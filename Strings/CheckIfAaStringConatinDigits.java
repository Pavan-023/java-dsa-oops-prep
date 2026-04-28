package Strings;

public class CheckIfAaStringConatinDigits {
    public static void main(String[] args) {
        String s="pavan1";
        boolean check=false;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch<65){
                check=true;
                break;
            }
        }
        if(check){
            System.out.println("Contain Digit");
        }else{
            System.out.println("Dont have any digit");
        }
    }
}
