import java.util.Arrays;
import java.util.Scanner;
public class SLSM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size ");
            int size=sc.nextInt();
            int arr[] =new int[size];
            System.out.println("enter elements");
            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();
            }

            Arrays.sort(arr);
            System.out.print(Arrays.toString(arr));

        
    }
}
// 023130
// 231300