package com.gabrielle_santiago.GameCatalog.dto;

public class GameSearchDTO {
    
    private String relation;
    private String name;
    private String criteria;

    public String getRelation() {
        return relation;
    }
    public void setRelation(String relation) {
        this.relation = relation;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCriteria() {
        return criteria;
    }
}
