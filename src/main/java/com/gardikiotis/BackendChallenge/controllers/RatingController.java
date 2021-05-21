package com.gardikiotis.BackendChallenge.controllers;

import com.gardikiotis.BackendChallenge.services.RatedEntityService;
import com.gardikiotis.BackendChallenge.services.RatingService;
import org.springframework.stereotype.Controller;

@Controller
public class RatingController {

    final
    RatingService ratingService;

    final
    RatedEntityService ratedEntityService;


    public RatingController(RatingService ratingService, RatedEntityService ratedEntityService) {
        this.ratingService = ratingService;
        this.ratedEntityService = ratedEntityService;
    }


}
