package DailyPractise;

public class DigitSum {
    public static void main(String[] args) {
        int n=38;
        System.out.println(getdigitsum(n));

    }
    public static int getdigitsum(int n){
        if(n==0) return 0;
        
        while(n>=10){
            int sum=0;
            while(n!=0){
            int d=n%10;
            sum=sum+d;
            n/=10;

        }n=sum;
        }
        return (int)n;
    }
}
