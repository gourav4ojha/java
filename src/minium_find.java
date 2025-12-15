
public class minium_find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,5,6,8,9,1,5};
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(min>arr[i])min=arr[i];
		}
		System.out.println(min);

	}

}
