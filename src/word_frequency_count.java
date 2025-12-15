import java.util.Scanner;
import java.util.*;

public class word_frequency_count {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] st = str.trim().split("\\s+");
		Map <String,Integer> map = new HashMap<>();
		for(String i:st) {
			map.put(i, map.getOrDefault(i,0)+1);
		}
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
        }
	}
}
