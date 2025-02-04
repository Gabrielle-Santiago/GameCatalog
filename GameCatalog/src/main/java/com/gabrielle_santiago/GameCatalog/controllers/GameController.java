package com.gabrielle_santiago.GameCatalog.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gabrielle_santiago.GameCatalog.dto.GameReviewDTO;
import com.gabrielle_santiago.GameCatalog.services.GameSevice;

@RestController
public class GameController {

    private GameSevice gameService;
    
    public GameController(GameSevice gameSevice) {
        this.gameService = gameSevice;
    }

    @GetMapping("/game")
    public List<GameReviewDTO> getGameReviews(
        @RequestParam(required = false, defaultValue = "3717") Long gameId) {
        return gameService.getReviews(gameId);
    }
}
