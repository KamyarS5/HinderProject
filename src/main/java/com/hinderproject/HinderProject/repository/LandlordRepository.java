package com.hinderproject.HinderProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hinderproject.HinderProject.model.Landlord;

@Repository
public interface LandlordRepository extends JpaRepository<Landlord, Long> {
}