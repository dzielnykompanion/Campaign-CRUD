package com.golabek.campaignapp.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CampaignIdException extends RuntimeException{
    public CampaignIdException(String message) {
        super(message);
    }
}
