import

import java.util.Scanner;

public class Example2122bis {
    public static void main(String[] argv) {
        int positives, i, num;
//Reading the value
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        i = 0;
        positives = 0;
        while (i < 10) {
            System.out.println("Enter the number: ");
            num = inputValue.nextInt();
            if (num >= 0) {
                positives = positives + 1;
            }
            i = i + 1;
        }
        System.out.println(positives + " positives");
    }
}
