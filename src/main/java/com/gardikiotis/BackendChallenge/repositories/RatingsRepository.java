package com.gardikiotis.BackendChallenge.repositories;

import com.gardikiotis.BackendChallenge.models.Rating;
import org.springframework.data.repository.CrudRepository;

public interface RatingsRepository  extends CrudRepository<Rating,Integer> {
}
