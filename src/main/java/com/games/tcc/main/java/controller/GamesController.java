
package com.games.tcc.main.java.controller;

import com.games.tcc.main.java.entities.Games;
import com.games.tcc.main.java.services.GamesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/games")
public class GamesController {
    
    
    @Autowired
    private GamesService gamesService;
    
    
    
    @GetMapping
    public List<Games> findAll(){
        List<Games> result = gamesService.findAll();
        return result;
    }
    
}
