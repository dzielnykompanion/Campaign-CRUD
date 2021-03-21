package com.golabek.campaignapp.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;
    @NotNull
    private int funds;

    @OneToMany
    private Collection<Campaign> campaigns = new ArrayList<Campaign>();
}
