package com.golabek.campaignapp.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer funds;

    @OneToMany
    private Collection<Campaign> campaigns = new ArrayList<>();

    public Seller() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFunds() {
        return funds;
    }

    public void setFunds(int funds) {
        this.funds = funds;
    }

    public Collection<Campaign> getCampaigns() {
        return campaigns;
    }

    public void setCampaigns(Collection<Campaign> campaigns) {
        this.campaigns = campaigns;
    }
}
