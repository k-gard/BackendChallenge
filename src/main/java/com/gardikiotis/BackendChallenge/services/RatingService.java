package com.gardikiotis.BackendChallenge.services;

import com.gardikiotis.BackendChallenge.repositories.RatingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RatingService {
    final
    RatingsRepository ratingsRepository;

    public RatingService(RatingsRepository ratingsRepository) {
        this.ratingsRepository = ratingsRepository;
    }
}
