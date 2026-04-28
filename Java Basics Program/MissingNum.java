import java.util.Scanner;

public class MissingNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int size= sc.nextInt();
       
        int arr[]=new int[size];

        System.out.println("Enter the Array Elements And Give ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        
        int require= (size*(size+1))/2;
        int sum=0;
        for(int i=0;i<=size-1;i++){
            sum += arr[i];

        }
        int result= require-sum;
        System.out.println("Your Result is : ");
        System.out.println(result);

        

    }
}
