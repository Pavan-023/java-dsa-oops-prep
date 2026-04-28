package Strings;

public class ReplaceACharacterToanother {
    public static void main(String[] args) {
        String s=" Hello pavan Kalyan How are you";
        String replace="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'){
                replace+='@';
            }else{
                replace+=ch;
            } 
            
        }
        System.out.println(replace);
        
    }
}
