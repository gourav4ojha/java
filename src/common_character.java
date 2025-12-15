import java.util.*;

public class common_character {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.print("Common characters: ");
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);

            if (s2.indexOf(c) != -1 && s1.indexOf(c) == i) {
                ans.append(c);
            }
        }
        System.out.println(ans.toString());
    }
}
