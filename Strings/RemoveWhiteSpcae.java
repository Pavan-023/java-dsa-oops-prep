package Strings;
public class RemoveWhiteSpcae {
    public static void main(String[] args) {
        String s=" hello kalyan ";
        String str="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=' '){
                str+=ch;
            }
            
        }
        System.out.println(str);

    }
}
