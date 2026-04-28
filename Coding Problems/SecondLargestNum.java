import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=sc.nextInt();
        int arr[]= new int[size];
        System.out.println("Enter elements: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("The second largest num is "+arr[size-2]);
    }
}
