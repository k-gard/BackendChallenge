package com.gardikiotis.BackendChallenge.services;

import com.gardikiotis.BackendChallenge.repositories.RatedEntitiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RatedEntityService {
    final
    RatedEntitiesRepository ratedEntitiesRepository;

    public RatedEntityService(RatedEntitiesRepository ratedEntitiesRepository) {
        this.ratedEntitiesRepository = ratedEntitiesRepository;
    }
}
