package com.producter.intern.repository;

import com.producter.intern.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface PlayerRepository extends JpaRepository<Player,Long> {

    @Transactional
    void deleteById(Long id);

    boolean existsById(Long id);
}
