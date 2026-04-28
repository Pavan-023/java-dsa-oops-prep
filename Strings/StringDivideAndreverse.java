package Strings;

public class StringDivideAndreverse {
    public static void main(String[] args) {
        String s="Oddnumber";
        if(s.length()%2!=0){
            s=s.substring(0, s.length()-1);
        }
        int mid=s.length()/2;
        String first=s.substring(0, mid);
        String last=s.substring(mid+1,s.length());
        String f=new StringBuilder(first).reverse().toString();
        String l=new StringBuilder(last).reverse().toString();
        String op=f+l;
        System.out.println(op);
    }
}
