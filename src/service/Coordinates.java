package service;

// Класс констант enum для реализации координатного расположения гор, о которых говорили гавные герои в истории
public enum Coordinates {
    SOUTHERN_LATITUDE1 ("60' восточной долготы"),
    EASTERN_LONGITUDE1("82' южной широты"),
    SOUTHERN_LATITUDE2 ("115' восточной долготы"),
    EASTERN_LONGITUDE2("70' южной широты");

    private final String title;

    // Контруктор, в который передается описание координатного объекта
    Coordinates(String title) {
        this.title = title;
    }

    // геттер для взятия поля "title" координатного объекта
    public String getTitle() {
        return this.title;
    }

}
