package pl.javastart.task;

import java.util.Scanner;

public class SeasonManager {

    // uzupełnij metodę - do wczytywania danych użyj przekazany Scanner
    public void run(Scanner scanner) {
        printSeasonsToBeChoosen();
        chooseTheSeasonOfTheYearAndPrintItsMonths(scanner);
    }

    private static void chooseTheSeasonOfTheYearAndPrintItsMonths(Scanner scanner) {

        Season season = Season.seasonFromString(scanner.nextLine());
        if (season != null) {
            season.printMonths();
        } else {
            System.err.println("Niewłaściwy wybór");    
        }
    }

    private static void printSeasonsToBeChoosen() {
        System.out.println("Podaj porę roku:");
        for (Season value : Season.values()) {
            System.out.println(value.getDescription());
        }
    }
}
