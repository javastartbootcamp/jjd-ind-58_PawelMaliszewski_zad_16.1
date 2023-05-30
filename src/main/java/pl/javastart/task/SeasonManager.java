package pl.javastart.task;

import java.util.Objects;
import java.util.Scanner;

public class SeasonManager {

    // uzupełnij metodę - do wczytywania danych użyj przekazany Scanner
    public void run(Scanner scanner) {
        printSeasons();
        askForTheSeasonOfTheYearAndPrintItsMonths(scanner);
    }

    private static void askForTheSeasonOfTheYearAndPrintItsMonths(Scanner scanner) {
        try {
            Season season = Season.seasonFromString(scanner.nextLine());
            Objects.requireNonNull(season).printMonths();
        } catch (NullPointerException e) {
            System.err.println("Niewłaściwy wybór");
        }
    }

    private static void printSeasons() {
        System.out.println("Podaj porę roku:");
        for (Season value : Season.values()) {
            System.out.println(value.getDescription());
        }
    }
}
