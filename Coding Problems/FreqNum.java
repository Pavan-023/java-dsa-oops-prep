// import java.util.Scanner;
// public class FreqNum {
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.err.println("ENter th Size of Array ");
//         int size=sc.nextInt();
//         int arr[]=new int[size];
//         for(int i=0;i<size;i++){
//             arr[i]=sc.nextInt();
//         }
//         // 
//         for(int i = 0; i < size; i++) {
//             int count = 1;  
//             if(arr[i]==-1) continue;
//             for(int j = i + 1; j < size; j++) {
//                 if(arr[i] == arr[j]) {
//                     count++;
//                     arr[j]=-1;
//                 }
//             }
//             System.out.println("Count of " + arr[i] + " is " + count);
//         }
//     }
// }
public class FreqNum{
    public static void main(String[] args){
        int arr[]={5,5,3,8,2,3,8,1};
        for(int i=0;i<arr.length;i++){
           int count =1;
           if(arr[i]==-1) continue;
           for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                count++;
                arr[j]=-1;
            }
           }
           System.out.println(arr[i]+" "+count);
        }
    }
}