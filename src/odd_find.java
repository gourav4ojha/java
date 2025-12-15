import java.util.*;
public class odd_find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,43,54,66,76,89,33,45,56,3,87,53,91,0};
		ArrayList<Integer> ans = new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2 != 0)ans.add(arr[i]);
		}
		for(int num:ans)System.out.print(num +" ");
	}

}
