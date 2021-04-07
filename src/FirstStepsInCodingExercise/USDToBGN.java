package FirstStepsInCodingExercise;

import java.util.Scanner;

public class USDToBGN {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double usd = Double.parseDouble(scanner.nextLine());
        double usdToBgnRate = 1.79549;
        double bgn = usd * usdToBgnRate;

        System.out.println(bgn);
    }
}
