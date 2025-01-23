package com.gabrielle_santiago.GameCatalog.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.gabrielle_santiago.GameCatalog.dto.GameIdDTO;
import com.gabrielle_santiago.GameCatalog.services.GameIdService;

@RestController
public class GameIdController {

    private GameIdService gameIdService;

   public GameIdController(GameIdService gameIdService) {
        this.gameIdService = gameIdService;
    }

    @GetMapping("/game/{id}")
    public ResponseEntity<GameIdDTO> getGameId(@PathVariable Number id) {
        return ResponseEntity.ok(gameIdService.getGameId(id));
    }
}
