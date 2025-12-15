import java.util.*;
public class character_shift {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'z')
                    result.append('a');
                else
                    result.append((char)(ch + 1));
            } else {
                result.append(ch); // non-letter stays same
            }
        }

        System.out.println(result.toString());
	}

}
