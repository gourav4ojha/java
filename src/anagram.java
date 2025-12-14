import java.util.*;
public class anagram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		if(str1.length() != str2.length()) {
			System.out.println("not anagrum");
			return;
		}
		Set<Character> st = new HashSet<>();
		StringBuffer s1 = new StringBuffer(str1);
		StringBuffer s2 = new StringBuffer(str2);
		for(int i=0; i<s1.length(); i++) {
			st.add(s1.charAt(i));
		}
		for(int i=0; i<s2.length(); i++) {
			if(st.contains(s2.charAt(i))) {
				st.remove(s2.charAt(i));
			}else {
				System.out.println("not anagrum");
				return;
			}
		}
		System.out.println("anagrum");
	}
}
