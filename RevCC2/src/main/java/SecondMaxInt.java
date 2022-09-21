import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SecondMaxInt {

    public void printSecondMax() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many triples will you provide?");
        int inCount = scanner.nextInt();

        String[] triplesArr = new String[inCount];
        System.out.println("Type " + inCount + " triples, each on a separate line below:");

        // To consume enter from .nextInt();
        scanner.nextLine();

        for (int i = 0; i < inCount; i++) {
            triplesArr[i] = scanner.nextLine();
        }
        System.out.println("Results:");
        for (String triple : triplesArr) {
            List<Integer> tArr = Arrays.stream(triple.split(" "))
                    .map(str -> Integer.valueOf(str)).collect(Collectors.toList());
            tArr.sort(Collections.reverseOrder());
            System.out.println(tArr.get(1));
        }
    }
}
