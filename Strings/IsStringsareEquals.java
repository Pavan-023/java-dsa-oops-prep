package Strings;

public class IsStringsareEquals {
    public static void main(String[] args) {
        String s1="Pavan";
        String s2="pAVAN";
        String s="";
        // if(s1.equalsIgnoreCase(s2)){
        //     System.out.println("TRUE");
        // }else{
        //     System.out.println("FALSE");
        // }
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            
            if(ch>='a' && ch<='z'){
                s+=(char)(ch-32);
            }
            else if(ch>='A' && ch<='Z'){
                s+=(char)(ch+32);
            }
            
        }
        System.out.println(s2);
        System.out.println(s);
        System.out.println(s2.equals(s));
       

    }
}
