package com.golabek.campaignapp.repository;

import com.golabek.campaignapp.model.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampaignRepo extends JpaRepository<Campaign, Long> {
}
