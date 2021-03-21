package com.golabek.campaignapp.exceptions;

public class SellerIdExceptionResponse {
    private String SellerID;

    public SellerIdExceptionResponse(String SellerID) {
        this.SellerID = SellerID;
    }

    public String getSellerID() {
        return SellerID;
    }

    public void setSellerID(String sellerID) {
        SellerID = sellerID;
    }
}
