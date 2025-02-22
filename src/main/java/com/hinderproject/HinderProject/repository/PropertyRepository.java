package com.hinderproject.HinderProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hinderproject.HinderProject.model.Property;

@Repository
public interface PropertyRepository extends JpaRepository<Property, Long> {
}
