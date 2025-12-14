import java.util.*;

public class prime_factor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        ArrayList<Integer> factors = new ArrayList<>();

        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                factors.add(i);
                num = num / i;
            }
        }

        System.out.println("Prime Factors: " + factors);
    }
}
