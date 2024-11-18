

package com.games.tcc.main.java.services;

import com.games.tcc.main.java.entities.Games;
import com.games.tcc.main.java.repositores.GamesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;





@Component
public class GamesService {
    
    @Autowired
    private GamesRepository gamesRepository;
        
    
    
    public List<Games> findAll(){
        List<Games> result = gamesRepository.findAll();
        return  result;
    }
    
    
    
}
