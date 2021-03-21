package com.golabek.campaignapp.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler
    public final ResponseEntity<Object> handleCampaignIdException(CampaignIdException ex, WebRequest request){
        CampaignIdExceptionResponse campaignIdExceptionResponse = new CampaignIdExceptionResponse(ex.getMessage());
        return new ResponseEntity<>(campaignIdExceptionResponse, HttpStatus.BAD_REQUEST);
    }

}
