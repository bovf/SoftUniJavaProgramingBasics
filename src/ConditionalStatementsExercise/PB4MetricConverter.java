package ConditionalStatementsExercise;

import java.util.Scanner;

public class PB4MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double quantity = Double.parseDouble(scanner.nextLine());
        String unitsOriginal = scanner.nextLine();
        String unitsConverted = scanner.nextLine();
        double unitsOutput = 0;

        if (unitsOriginal.equals("mm")){
            if (unitsConverted.equals("m")){
                unitsOutput = quantity / 1000;
            }else if (unitsConverted.equals("cm")){
                unitsOutput = quantity / 10;
            }
        }else if (unitsOriginal.equals("m")){
            if (unitsConverted.equals("cm")){
                unitsOutput = quantity * 100;
            }else if (unitsConverted.equals("mm")){
                unitsOutput = quantity * 1000;
            }
        }else if (unitsOriginal.equals("cm")){
            if (unitsConverted.equals("m")){
                unitsOutput = quantity / 100;
            }else if (unitsConverted.equals("mm")){
                unitsOutput = quantity * 10;
            }
        }

        System.out.printf("%.3f", unitsOutput);
    }
}
