import java.util.*;

public class bineary_to_decimal {
	public static int binaryToDecimal(String binary) {
	    int decimal = 0;
	    int power = 0;

	    for (int i = binary.length() - 1; i >= 0; i--) {
	        int digit = binary.charAt(i) - '0';
	        decimal += digit * Math.pow(2, power);
	        power++;
	    }
	    return decimal;
	}
	
//	int binary = 1011;
//	int decimal = 0;
//	int power = 0;
//
//	while (binary > 0) {
//	    int lastDigit = binary % 10;
//	    decimal += lastDigit * Math.pow(2, power);
//	    binary /= 10;
//	    power++;
//	}
//
//	System.out.println(decimal);


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cs = new Scanner(System.in);
		String str = cs.nextLine();
		System.out.println("manual "+binaryToDecimal(str));
		int num = Integer.parseInt(str,2);
		System.out.println(num);

	}

}
