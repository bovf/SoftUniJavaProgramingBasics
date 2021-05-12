package ConditionalStatementsExercise;

import java.util.Scanner;

public class PB3SpeedInfo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double speed = Double.parseDouble(scanner.nextLine());
        String speedWord = "";

        if (speed <= 10){
            speedWord = "slow";
        }else if (speed <= 50){
            speedWord = "average";
        }else if (speed <= 150){
            speedWord = "fast";
        }else if (speed <= 1000){
            speedWord = "ultra fast";
        }else if (speed > 1000){
            speedWord = "extremely fast";
        }

        System.out.printf("%s", speedWord);
    }
}
