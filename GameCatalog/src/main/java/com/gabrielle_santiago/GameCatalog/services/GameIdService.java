package com.gabrielle_santiago.GameCatalog.services;

import org.springframework.stereotype.Service;

import com.gabrielle_santiago.GameCatalog.client.OpenCitricClientId;
import com.gabrielle_santiago.GameCatalog.dto.GameIdDTO;

@Service
public class GameIdService {
    
    private OpenCitricClientId openCitricClientId;

    public GameIdService(OpenCitricClientId openCitricClientId) {
        this.openCitricClientId = openCitricClientId;
    }

    public GameIdDTO getGameId(Number id) {
        return openCitricClientId.fetchGameId(id);
    }
}
