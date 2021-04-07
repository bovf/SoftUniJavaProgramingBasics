package FirstStepsInCodingExercise;

import java.util.Scanner;

public class RadiansToDegrees {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double angle = Double.parseDouble(scanner.nextLine());

        double degrees = angle * 180 / Math.PI;

        System.out.printf("%.0f", degrees);
    }
}
