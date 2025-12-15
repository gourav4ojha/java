import java.util.*;
public class factorial_compute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int compute=1;
		for(int i=1; i<=n; i++) {
			compute *= i;
		}
		System.out.println(compute);

	}

}
