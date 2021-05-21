package com.gardikiotis.BackendChallenge.repositories;

import com.gardikiotis.BackendChallenge.models.RatedEntity;
import org.springframework.data.repository.CrudRepository;

public interface RatedEntitiesRepository extends CrudRepository<RatedEntity,Integer> {
}
