import java.util.*;
public class Array_intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr1 = new int[]{5,6,7,3,9};
		int []arr2 = new int[]{3,5,6,7,9,3};
		Set<Integer> map = new HashSet<>();
		for(int i:arr1) {
			map.add(i);
		}
		ArrayList<Integer> ans = new ArrayList<>();
		for(int i:arr2) {
			if(map.contains(i)) {
				ans.add(i);
				map.remove(i);
			}
		}
		for(int i : ans) {
			System.out.print(i);
		}
	}

}
