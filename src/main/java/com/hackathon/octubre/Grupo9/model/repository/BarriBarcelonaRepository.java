package com.hackathon.octubre.Grupo9.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hackathon.octubre.Grupo9.model.domain.BarriBarcelona;

@Repository
public interface BarriBarcelonaRepository extends JpaRepository<BarriBarcelona, String>{

}
