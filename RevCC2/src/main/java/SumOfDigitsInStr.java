import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SumOfDigitsInStr {

    public void printSum() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many strings will you provide?");
        int inCount = scanner.nextInt();

        // To consume enter from .nextInt();
        scanner.nextLine();

        List<Integer> caseList = new ArrayList<>();

        System.out.println("Type " + inCount + " strings, each on a separate line below:");
        for (int i = 0; i < inCount; i++) {
            String filteredInput = scanner.nextLine().replaceAll("[^0-9]", "");
            Integer num = Integer.valueOf(filteredInput);
            caseList.add(num);
        }

        System.out.println("Results:");
        for (Integer c : caseList) {
            int sum = 0;
            while (c > 0) {
                int remainder = c % 10;
                sum += remainder;
                c /= 10;
            }

            System.out.println(sum);
        }


    }

}
