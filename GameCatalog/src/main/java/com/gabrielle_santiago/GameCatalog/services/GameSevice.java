package com.gabrielle_santiago.GameCatalog.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gabrielle_santiago.GameCatalog.client.OpenCitricCliente;
import com.gabrielle_santiago.GameCatalog.dto.GameReviewDTO;

@Service
public class GameSevice {
    
    private OpenCitricCliente openCitricClient;

    public GameSevice(OpenCitricCliente openCitricCliente) {
        this.openCitricClient = openCitricCliente;
    }

    public List<GameReviewDTO> getReviews(Long gameId) {
        return openCitricClient.fetchGameReviews(gameId);
    }
}
