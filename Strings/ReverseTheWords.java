package Strings;
public class ReverseTheWords {
    public static void main(String[] args) {
        String s="Hello pavan kalyan How are you";
       String rev[]=s.split(" ");
       for(int i=rev.length-1;i>=0;i--){
          System.out.print(rev[i]+" ");
       }
    }
}
