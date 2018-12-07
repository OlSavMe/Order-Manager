package com.project.manager.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UnitRepository extends CrudRepository<Unit, Long> {

    List<Unit> findByName(String name);

}
