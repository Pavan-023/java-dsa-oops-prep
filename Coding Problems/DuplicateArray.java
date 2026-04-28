import java.util.Arrays;

class DuplicateArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 3, 2, 5 };

        // Sort the array
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        int j = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];

            }
        }
        System.out.println("Removed Dups: ");
        for (int i = 0; i <= j; i++) {
            System.out.println(arr[i]);
        }
    }
}
