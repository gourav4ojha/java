public class swap_2_elements {

    public static void main(String[] args) {

        int[] arr = {2, 5, 8, 3, 6}; // change size here

        if (arr.length % 2 == 0) {
            // even length
            for (int i = 1; i < arr.length; i += 2) {
                System.out.print(arr[i]);
                System.out.print(arr[i - 1]);
            }
        } else {
            // odd length
            for (int i = 1; i < arr.length; i += 2) {
                System.out.print(arr[i]);
                System.out.print(arr[i - 1]);
            }
            System.out.print(arr[arr.length - 1]);
            System.out.print(arr[arr.length - 2]);
        }
    }
}
