package com.producter.intern.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.producter.intern.entity.Player;
import com.producter.intern.repository.PlayerRepository;
import com.producter.intern.service.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

@Component
@RequiredArgsConstructor
@Validated
public class PlayerMutation implements GraphQLMutationResolver {

    private final PlayerRepository playerRepository;
    private final PlayerService playerService;

     public Player addPlayer(@Valid Player player){
         Player addedPlayer = playerService.addPlayer(player);
         return addedPlayer;
     }

     public void deletePlayer(Long id){
        playerService.deletePlayer(id);
     }


}
