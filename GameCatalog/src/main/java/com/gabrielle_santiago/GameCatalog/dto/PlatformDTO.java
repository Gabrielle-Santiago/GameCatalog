package com.gabrielle_santiago.GameCatalog.dto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PlatformDTO {

    private Long id;
    private String name;
    private String shortName;
    private String imageSrcV2;
    private String releaseDate;

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getShortName() {
        return shortName;
    }
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }
    public String getImageSrcV2() {
        return imageSrcV2;
    }
    public void setImageSrcV2(String imageSrcV2) {
        this.imageSrcV2 = imageSrcV2;
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
