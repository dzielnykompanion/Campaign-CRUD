package com.golabek.campaignapp.repository;

import com.golabek.campaignapp.model.Town;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TownRepo extends JpaRepository<Town, Long> {
}
