package com.gabrielle_santiago.GameCatalog.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gabrielle_santiago.GameCatalog.dto.GameSearchDTO;
import com.gabrielle_santiago.GameCatalog.services.GameSearchService;

@RestController
public class GameSerchController {

    private GameSearchService search;

    public GameSerchController(GameSearchService search) {
        this.search = search;
    }
 
    @GetMapping("/meta/search")
        public ResponseEntity<List<GameSearchDTO>> getSearch(@RequestParam String criteria) {
        return ResponseEntity.ok(search.getSearch(criteria));
    }
}
