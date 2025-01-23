package com.gabrielle_santiago.GameCatalog.dto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class GameReviewDTO {

    private Long id;
    private String name;
    private String url;
    private String firstReleaseDate;
    private Double topCriticScore;
    
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getFirstReleaseDate() {
        if (firstReleaseDate != null) {
            LocalDate date = LocalDate.parse(firstReleaseDate, DateTimeFormatter.ISO_DATE_TIME);
            return String.valueOf(date.getYear());
        }
        return null;
    }
    public void setFirstReleaseDate(String firstReleaseDate) {
        this.firstReleaseDate = firstReleaseDate;
    }
    public Double getTopCriticScore() {
        if (topCriticScore != null) {
            return Math.round(topCriticScore * 1000.0) / 1000.0;
        }
        return null;
    }
    public void setTopCriticScore(Double topCriticScore) {
        this.topCriticScore = topCriticScore;
    }
}
