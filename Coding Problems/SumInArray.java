import java.util.ArrayList;
import java.util.Scanner;
public class SumInArray{
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        // arr.add(2);
        // // arr.add(5);
        // arr.add(3);
        // arr.add(4);
        int count=0;
        Scanner sc= new Scanner(System.in);
        int s=sc.nextInt();
        for(int i=0;i<s;i++){
            arr.add(sc.nextInt());
        }
        for(int i=0;i<arr.size();i++){
            for(int j=i+1;j<arr.size();j++){
                int sum=arr.get(i)+arr.get(j);
                if(arr.contains(sum)){
                    count++;
                }
            }
        }
        System.err.println("The pair sum are : "+count);
    }
}

