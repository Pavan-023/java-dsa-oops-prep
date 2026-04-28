import java.util.Scanner;
import java.util.TreeSet;

public class LargestSmallest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Sixe of array");
        int size= sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the Array Elements");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int max=0;
        int min=9;
        for(int i=0;i<size;i++){
            if(arr[i] > max){
                max=arr[i];
            }if(arr[i]< min){
                min=arr[i];
            }
        }
        System.out.println("MAx is "+max);
        System.out.println("Min is "+min);
    }
   
    
}
