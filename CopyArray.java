import java.util.Scanner;
import java.util.Arrays;
public class CopyArray {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scan.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr1[i] = scan.nextInt();
        }
        System.out.println("Original Array: "+Arrays.toString(arr1));
        int[] arr2=new int[arr1.length];
        for(int i=0; i<arr1.length;i++){
            arr2[i]=arr1[i];
        }
        System.out.print("Copied Array: "+Arrays.toString(arr2));
        scan.close();
    }
}
