package com.golabek.campaignapp.exceptions;

public class SellerFundsExceptionResponse {

    private String SellerFunds;

    public SellerFundsExceptionResponse(String SellerFunds) {
        this.SellerFunds = SellerFunds;
    }

    public String getSellerFunds() {
        return SellerFunds;
    }

    public void setSellerFunds(String sellerFunds) {
        SellerFunds = sellerFunds;
    }
}
