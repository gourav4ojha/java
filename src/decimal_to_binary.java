import java.util.*;
public class decimal_to_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num>255) {
			System.out.println("write number less then 255");
			return;
		}
		String ans="";
		while(num>0) {
			ans=(num%2)+ans;
			num /=2;
		}
		System.out.println(ans);

	}

}
