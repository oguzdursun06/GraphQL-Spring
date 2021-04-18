package com.producter.intern;

import com.producter.intern.entity.Player;
import com.producter.intern.repository.PlayerRepository;
import com.producter.intern.service.PlayerService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class PlayerServiceTest {

        @InjectMocks
        private PlayerService playerService;

        @Mock
        private PlayerRepository playerRepository;

        @Test
        public void testAddPlayer(){
            Player player = new Player();
            player.setName("Oguzhan");
            player.setSurname("Dursun");
            player.setPosition("C");


            Mockito.when(playerRepository.save(ArgumentMatchers.any(Player.class))).thenReturn(player);

            Player addedPlayer = playerRepository.save(player);

            assertEquals(addedPlayer.getName(), player.getName());
            assertEquals(addedPlayer.getSurname(), player.getSurname());
            assertEquals(addedPlayer.getPosition(), player.getPosition());
        }
}
