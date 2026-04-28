package Strings;

public class CovertUppettoLowerCase {
    public static void main(String[] args) {
        String s="Hello Pavan Kalyan";
        String ul=" ";
       
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a'&& ch<='z'){
                ul+=(char)(ch-32);
            }else if(ch>='A'&& ch<='Z'){
                 ul+=(char)(ch+32);
            }
        }
        System.out.println(ul);
       
    }
}
