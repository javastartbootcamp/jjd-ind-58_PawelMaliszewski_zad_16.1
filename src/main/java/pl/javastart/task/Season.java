package pl.javastart.task;

import java.util.List;

public enum Season {
    //uzupełnij
    SPRING("Wiosna", List.of("marzec", "kwiecień", "maj")),
    SUMMER("Lato", List.of("czerwiec", "lipiec", "sierpień")),
    AUTUMN("Jesień", List.of("wrzesień", "październik", "listopad")),
    WINTER("Zima", List.of("grudzień", "styczeń", "luty"));

    private final String description;
    private final List<String> months;

    Season(String description, List<String> months) {
        this.description = description;
        this.months = months;
    }

    public String getDescription() {
        return description;
    }

    public void printMonths() {
        System.out.println(months);
    }

    public static Season seasonFromString(String string) {
        for (Season season : values()) {
            if (season.description.equalsIgnoreCase(string)) {
                return season;
            }
        }
        return null;
    }
}