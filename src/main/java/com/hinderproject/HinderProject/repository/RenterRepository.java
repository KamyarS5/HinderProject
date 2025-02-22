package com.hinderproject.HinderProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hinderproject.HinderProject.model.Renter;

@Repository
public interface RenterRepository extends JpaRepository<Renter, Long> {
}
