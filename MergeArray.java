import java.util.Arrays;
import java.util.Scanner;
public class MergeArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of first sorted array: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter " + n1 + " sorted elements:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }
        System.out.print("Enter size of second sorted array: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter " + n2 + " sorted elements:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }
        int[] mergedArray = mergeSortedArrays(arr1, arr2);
        System.out.println("Merged Sorted Array: " + Arrays.toString(mergedArray));
        scanner.close();
    }
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length)
            merged[k++] = (arr1[i] < arr2[j]) ? arr1[i++] : arr2[j++];
        while (i < arr1.length) merged[k++] = arr1[i++];
        while (j < arr2.length) merged[k++] = arr2[j++];
        return merged;
    }
    
}
