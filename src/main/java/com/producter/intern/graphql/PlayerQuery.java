package com.producter.intern.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.producter.intern.entity.Player;
import com.producter.intern.repository.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PlayerQuery implements GraphQLQueryResolver {

    private final PlayerRepository playerRepository;


    public List<Player> getAllPlayers(){
        return playerRepository.findAll();
    }
}
