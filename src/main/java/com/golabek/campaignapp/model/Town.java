package com.golabek.campaignapp.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
public class Town {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @NotBlank
    private String name;

    @NotNull
    @OneToMany
    @JoinColumn(name = "town_id")
    private Set<Campaign> campaigns;
}
