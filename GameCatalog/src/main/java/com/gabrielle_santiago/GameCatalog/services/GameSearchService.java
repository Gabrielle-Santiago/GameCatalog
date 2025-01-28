package com.gabrielle_santiago.GameCatalog.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gabrielle_santiago.GameCatalog.client.OpenCitricSearch;
import com.gabrielle_santiago.GameCatalog.dto.GameSearchDTO;

@Service
public class GameSearchService {
    
    private OpenCitricSearch openCitricSearch;

    public GameSearchService(OpenCitricSearch openCitricSearch) {
        this.openCitricSearch = openCitricSearch;
    };

    public List<GameSearchDTO> getSearch(String criteria) {
        return openCitricSearch.fetchGameSearch(criteria);
    }
}
