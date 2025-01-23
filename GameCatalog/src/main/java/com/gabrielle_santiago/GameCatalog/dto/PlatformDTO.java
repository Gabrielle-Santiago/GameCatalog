package com.gabrielle_santiago.GameCatalog.dto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PlatformDTO {

    private String name;
    private String releaseDate;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getReleaseDate() {
        if (releaseDate != null) {
            LocalDate date = LocalDate.parse(releaseDate, DateTimeFormatter.ISO_DATE_TIME);
            return String.valueOf(date.getYear());
        }
        return null;
    }
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}
