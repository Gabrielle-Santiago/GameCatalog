package com.gabrielle_santiago.GameCatalog.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabrielle_santiago.GameCatalog.dto.GenreDTO;
import com.gabrielle_santiago.GameCatalog.services.GameGenreService;

@RestController
public class GameGenreController {
    
     private GameGenreService gameGenreService;

    public GameGenreController(GameGenreService gameGenreService) {
        this.gameGenreService = gameGenreService;
    }

    @GetMapping("/genre")
    public ResponseEntity<List<GenreDTO>> getGenre() {
        return ResponseEntity.ok(gameGenreService.getGenre());
    }
}
