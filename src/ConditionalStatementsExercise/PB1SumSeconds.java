package ConditionalStatementsExercise;

import java.util.Scanner;

public class PB1SumSeconds {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstFinish = Integer.parseInt(scanner.nextLine());
        int secondFinish = Integer.parseInt(scanner.nextLine());
        int thirdFinish = Integer.parseInt(scanner.nextLine());

        int totalSeconds = firstFinish + secondFinish + thirdFinish;
        double totalMinutes = Math.floor((double) totalSeconds / 60);
        double seconds = totalSeconds % 60;

        if (totalMinutes < 10) {
            if (seconds < 10) {
                System.out.printf("%.0f:0%.0f", totalMinutes, seconds);
            } else {
                System.out.printf("%.0f:%.0f", totalMinutes, seconds);
            }
        } else {
            if (seconds < 10) {
                System.out.printf("%.0f:0%.0f", totalMinutes, seconds);
            } else {
                System.out.printf("%.0f:%.0f", totalMinutes, seconds);
            }

        }
    }
}
