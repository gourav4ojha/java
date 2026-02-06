import java.util.*;

public class c_f_c {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the unit (C/F): ");
        Char ch = sc.nextChar().toUpperCase();

        System.out.print("Enter the value: ");
        float num = sc.nextFloat();

        if (ch.equals("F")) {
            float celsius = (num - 32) * 5 / 9;
            System.out.println(celsius + " C");
        } else if (ch.equals("C")) {
            float fahrenheit = (num * 9 / 5) + 32;
            System.out.println(fahrenheit + " F");
        } else {
            System.out.println("Invalid unit! Please enter C or F.");
        }

        sc.close();
    }
}
