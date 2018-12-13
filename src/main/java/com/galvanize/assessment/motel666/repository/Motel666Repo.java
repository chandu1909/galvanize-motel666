package com.galvanize.assessment.motel666.repository;

import com.galvanize.assessment.motel666.model.Events;
import org.springframework.data.repository.CrudRepository;


import java.util.UUID;

public interface Motel666Repo extends CrudRepository<Events, UUID> {

    Iterable<Events> findAllById(UUID id);
}
