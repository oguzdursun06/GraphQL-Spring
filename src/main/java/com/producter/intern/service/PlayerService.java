package com.producter.intern.service;

import com.producter.intern.entity.Player;
import com.producter.intern.exception.ValidationException;
import com.producter.intern.repository.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RequiredArgsConstructor
@Service
public class PlayerService {

    public final PlayerRepository playerRepository;
    public List<String> positionList = Arrays.asList(new String[]{"PG","SG","SF","PF","C"});

    public Player addPlayer(Player player){
        System.out.println(player.getName());
        if(player.getName().length() < 2 || player.getSurname().length() < 2){
            throw new ValidationException("Name or surname is invalid!");
        }
        else if(!positionList.contains(player.getPosition())){
            throw new ValidationException("Position is invalid, positions can only be PG,SG,SF,PF,C");
        }
        else if(playerRepository.count() == 20){
            throw new ValidationException("Team is full, please try again later!");
        }
        else{
            return playerRepository.save(player);
        }
    }


    public void deletePlayer(Long id){
        if(playerRepository.existsById(id) == true)
            playerRepository.deleteById(id);
        else{
            throw new ValidationException("User not found.");
        }
    }
}
