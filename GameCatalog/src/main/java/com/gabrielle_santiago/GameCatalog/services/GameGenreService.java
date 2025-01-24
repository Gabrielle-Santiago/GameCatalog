package com.gabrielle_santiago.GameCatalog.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gabrielle_santiago.GameCatalog.client.OpenCitricClientGenre;
import com.gabrielle_santiago.GameCatalog.dto.GenreDTO;

@Service
public class GameGenreService {

    private OpenCitricClientGenre openCitricClientGenre;

    public GameGenreService(OpenCitricClientGenre openCitricClientGenre) {
        this.openCitricClientGenre = openCitricClientGenre;
    }

    public List<GenreDTO> getGenre() {
        return openCitricClientGenre.fetchGameGenre();
    }
}
