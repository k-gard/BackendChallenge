package com.gardikiotis.BackendChallenge.models;

import com.gardikiotis.BackendChallenge.models.RatedEntity;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    @ManyToOne
    private RatedEntity ratedEntity;
    @Column
    @NotNull
    @Min(0)
    @Max(5)
    private double rating;
    @Column
    private int raterId;
    @Column
    @NotNull
    private LocalDateTime localDateTime;


    public Rating() {

    }

    public Rating(RatedEntity ratedEntity, float rating, int raterId,LocalDateTime localDateTime) {
        this.ratedEntity = ratedEntity;
        this.rating = rating;
        this.raterId = raterId;
        this.localDateTime = localDateTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RatedEntity getRatedEntity() {
        return ratedEntity;
    }

    public void setRatedEntity(RatedEntity ratedEntity) {
        this.ratedEntity = ratedEntity;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getRaterId() {
        return raterId;
    }

    public void setRaterId(int raterId) {
        this.raterId = raterId;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
