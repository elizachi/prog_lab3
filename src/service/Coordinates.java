package service;

public enum Coordinates {
    SOUTHERN_LATITUDE1 ("60' восточной долготы"),
    EASTERN_LONGITUDE1("82' южной широты"),
    SOUTHERN_LATITUDE2 ("115' восточной долготы"),
    EASTERN_LONGITUDE2("70' южной широты");

    private final String title;

    Coordinates(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

}
