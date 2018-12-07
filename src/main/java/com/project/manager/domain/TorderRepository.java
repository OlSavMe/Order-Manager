package com.project.manager.domain;



import java.util.Optional;

import org.springframework.data.repository.CrudRepository;



public interface TorderRepository extends CrudRepository<Torder, Long> {

    Optional<Torder> findById(Long id);

}

