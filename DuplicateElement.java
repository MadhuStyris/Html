public class DuplicateElement {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 2, 5, 4};
        System.out.println("Duplicate elements:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
