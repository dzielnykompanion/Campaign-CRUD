package com.golabek.campaignapp.service;

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
        //TODO
        return campaignRepo.save(campaign);
    }

    public List<Campaign> getAll(){
        return campaignRepo.findAll();
    }

    public Campaign findById(Long id){
        //TODO
        return campaignRepo.findById(id).get();
    }

    public void deleteById(Long id){
        //TODO
        campaignRepo.deleteById(id);
    }

}
