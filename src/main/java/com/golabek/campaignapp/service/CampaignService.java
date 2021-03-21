package com.golabek.campaignapp.service;

import com.golabek.campaignapp.exceptions.CampaignIdException;
import com.golabek.campaignapp.model.Campaign;
import com.golabek.campaignapp.repository.CampaignRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CampaignService {

    @Autowired
    private CampaignRepo campaignRepo;

    public Campaign addOrUpdateCampaign(Campaign campaign){
        // when update, check if exists
        if ( campaign.getId() != null) {
            Campaign existingCampaign = findById(campaign.getId());
        }
        return campaignRepo.save(campaign);
    }

    public List<Campaign> getAll(){
        return campaignRepo.findAll();
    }

    public Campaign findById(Long id){
        try {
            Campaign campaign = campaignRepo.findById(id).get();
            return campaign;
        } catch (Exception ex){
            throw new CampaignIdException("Campaign with ID " + id + " doesn't exist");
        }
    }

    public void deleteById(Long id){
        //check if exists
        Campaign existingCampaign = findById(id);

        campaignRepo.deleteById(id);
    }
}


