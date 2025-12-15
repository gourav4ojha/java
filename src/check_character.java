import java.util.*;
public class check_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		char ch = sc.nextLine().charAt(0);
//		if(str.valueOf(ch)==ch) {
		if (str.indexOf(ch) != -1) {
			System.out.println("Character "+ ch +" is present");
			return;
		}
		System.out.println("Character "+ ch + " is not present");
	}

}
