package com.golabek.campaignapp.exceptions;

public class CampaignIdExceptionResponse {

    private String CampaignID;

    public CampaignIdExceptionResponse(String CampaignID) {
        this.CampaignID = CampaignID;
    }

    public String getCampaignID() {
        return CampaignID;
    }

    public void setCampaignID(String campaignID) {
        CampaignID = campaignID;
    }
}