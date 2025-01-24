package com.gabrielle_santiago.GameCatalog.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GameIdDTO {
    
    private Number id;
    private String name;
    private String url;
    private Double percentRecommended;
    private Integer numReviews;
    private Integer numTopCriticReviews;
    private Integer medianScore;
    private String description;
    private GameImagesDTO images;

    @JsonProperty("Genres")
    private List<GenreDTO> genre;
    @JsonProperty("Platforms")
    private List<PlatformDTO> platforms;

    public Number getId() {
        return id;
    }
    public void setId(Number id) {
        this.id = id;
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
    public Double getPercentRecommended() {
        if (percentRecommended != null) {
            return Math.round(percentRecommended * 1000.0) / 1000.0;
        }
        return null;
    }
    public void setPercentRecommended(Double percentRecommended) {
        this.percentRecommended = percentRecommended;
    }
    public Integer getNumReviews() {
        return numReviews;
    }
    public void setNumReviews(Integer numReviews) {
        this.numReviews = numReviews;
    }
    public Integer getNumTopCriticReviews() {
        return numTopCriticReviews;
    }
    public void setNumTopCriticReviews(Integer numTopCriticReviews) {
        this.numTopCriticReviews = numTopCriticReviews;
    }
    public Integer getMedianScore() {
        return medianScore;
    }
    public void setMedianScore(Integer medianScore) {
        this.medianScore = medianScore;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public GameImagesDTO getImages() {
        return images;
    }
    public void setImages(GameImagesDTO images) {
        this.images = images;
    }
    public List<GenreDTO> getGenre() {
        return genre;
    }
    public void setGenre(List<GenreDTO> genre) {
        this.genre = genre;
    }
    public List<PlatformDTO> getPlatforms() {
        return platforms;
    }
    public void setPlatforms(List<PlatformDTO> platforms) {
        this.platforms = platforms;
    }
}
