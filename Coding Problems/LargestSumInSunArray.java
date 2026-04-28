import java.util.ArrayList;
import java.util.Scanner;

public class LargestSumInSunArray {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        System.err.println("Enter the Size of array: ");
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        for(int i=0;i<len;i++){
            arr.add(sc.nextInt());
        }
        int max=Integer.MIN_VALUE;
        int currentsum=0;
        for(int i=0;i<len;i++){
            currentsum+=arr.get(i);
             max=Math.max(max, currentsum);
            if(currentsum<0){
                currentsum=0;
            }
        }
        System.out.println("The max Sum is : "+max);

    }
}
