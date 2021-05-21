package com.gardikiotis.BackendChallenge.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;

@Entity
public class RatedEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    @NotNull
    private String type;
    @OneToMany
    private ArrayList<Rating> ratings;

    public RatedEntity() {
            }

    public RatedEntity(String type, ArrayList<Rating> ratings) {
        this.type = type;
        this.ratings = ratings;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(ArrayList<Rating> ratings) {
        this.ratings = ratings;
    }
}
