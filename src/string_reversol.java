import java.util.*;
public class string_reversol {
	
	public static String reverseManual(String str) {
	    char[] charArray = str.toCharArray();
	    int left = 0, right = charArray.length - 1;
	    
	    while (left < right) {
	        // Swap characters
	        char temp = charArray[left];
	        charArray[left] = charArray[right];
	        charArray[right] = temp;
	        left++;
	        right--;
	    }
	    return new String(charArray);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();
	    System.out.println("manual reverse "+reverseManual(str));
		StringBuffer sr = new StringBuffer(str);
	    System.out.println(	sr.reverse().toString());

	    

	}

}
