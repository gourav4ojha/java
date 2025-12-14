//fibonachi series upto a term
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==1) {
			System.out.println('0');
			return;
		}
		int arr[] = new int[n];
		arr[0]=0;
		arr[1]=1;
		
		for (int i=2; i<n; i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		
		
		for(int i:arr) {
			System.out.println(i);
		}

	}

}
