
public class floting_array_short {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] arr = {3.4f, 1.2f, 5.6f, 2.1f, 0.9f};

		for (int i = 0; i < arr.length - 1; i++) {
		    for (int j = 0; j < arr.length - i - 1; j++) {
		        if (arr[j] > arr[j + 1]) {
		            float temp = arr[j];
		            arr[j] = arr[j + 1];
		            arr[j + 1] = temp;
		        }
		    }
		}
		for (float x : arr) {
		    System.out.print(x + " ");
		}
	}
}
