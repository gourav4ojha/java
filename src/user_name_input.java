import java.util.*;
public class user_name_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		if(str.length()<3) {
			System.out.println("Give a valid name");
			return;
		}
		System.out.println("Hello "+str);

	}

}
