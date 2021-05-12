package ConditionalStatementsExercise;

import java.util.Scanner;

public class PB5TimePlus15Minutes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int totalMinutes = hour * 60 + minutes + 15;

        int hourOutput = Math.floorDiv(totalMinutes, 60);
        int minutesOutput = totalMinutes - hourOutput * 60;

        if (hourOutput < 24){
            if (minutesOutput < 10){
                System.out.printf("%d:0%d", hourOutput, minutesOutput);
            }else {
                System.out.printf("%d:%d", hourOutput, minutesOutput);
            }
        }else {
            hourOutput -= 24;
            if (minutesOutput < 10){
                System.out.printf("%d:0%d", hourOutput, minutesOutput);
            }else {
                System.out.printf("%d:%d", hourOutput, minutesOutput);
            }
        }
    }
}
