package com.jlingel.beararms.persistance.service;


import com.jlingel.beararms.models.Firearm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.jlingel.beararms.persistance.service.FirearmOperations;

public interface FirearmService extends FirearmOperations<Firearm>{

    Page<Firearm> findPaginated(Pageable pageable);

}
