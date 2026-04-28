import java.util.Scanner;
class ArraySum{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Size of array: ");
        int size=sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elements int the array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter your target");
        int target =sc.nextInt();
        boolean flag=false;
        int a=0,b=0;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                int sum= arr[i]+arr[j];
                if(sum==target){
                    a=arr[i];
                    b=arr[j];
                    flag =true;
                    break;
                }
                
            }
        }
        if(flag==false){
            System.out.println("Your target is not found in the Arrray");
        }else{
            System.out.println("Your target is  found in the Arrray "+a+" and "+b+" Position index");
        }


    }
}