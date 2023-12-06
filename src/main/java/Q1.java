import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        int daysInWeek = 7;
        int[] temperatures = new int[daysInWeek];
        inputTemperatures(temperatures);
        int highestTemperature = findHighestTemperature(temperatures);
        int lowestTemperature = findLowestTemperature(temperatures);

        System.out.println("Highest Temperature: " + highestTemperature);
        System.out.println("Lowest Temperature: " + lowestTemperature);
    }

    static void inputTemperatures(int[] temperatures) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < temperatures.length; i++) {
            System.out.print("Enter temperature for day " + (i + 1) + ": ");
            temperatures[i] = scanner.nextInt();
        }
    }

    static int findHighestTemperature(int[] temperatures) {
        int highestTemperature = temperatures[0];

        for (int temperature : temperatures) {
            if (temperature > highestTemperature) {
                highestTemperature = temperature;
            }
        }

        return highestTemperature;
    }

    static int findLowestTemperature(int[] temperatures) {
        int lowestTemperature = temperatures[0];

        for (int temperature : temperatures) {
            if (temperature < lowestTemperature) {
                lowestTemperature = temperature;
            }
        }

        return lowestTemperature;
    }
}

