package com.gabrielle_santiago.GameCatalog.client;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import com.gabrielle_santiago.GameCatalog.dto.GameSearchDTO;

@Component
public class OpenCitricSearch {
    
    private WebClient webClient;

    public OpenCitricSearch(WebClient.Builder builder) {
        this.webClient = builder.baseUrl("https://opencritic-api.p.rapidapi.com")
                .defaultHeader("x-rapidapi-key", "a5b92ae531msh5a9ebdf43c8c749p12c905jsn68ac48922f15") 
                .defaultHeader("x-rapidapi-host", "opencritic-api.p.rapidapi.com")
                .build();
    }

    public List<GameSearchDTO> fetchGameSearch(String criteria) {
        try {
            return webClient.get()
                    .uri("/meta/search?criteria=" + criteria)
                    .retrieve()
                    .bodyToFlux(GameSearchDTO.class)
                    .collectList()
                    .block();
        } catch (WebClientResponseException e) {
            System.err.println("Erro ao consumir a API: " + e.getMessage());
            throw e;
        }
    }
}
