package com.hinderproject.HinderProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hinderproject.HinderProject.repository.LandlordRepository;
import com.hinderproject.HinderProject.model.Landlord;
import java.util.List;

@Service
public class LandlordService {
    @Autowired
    private LandlordRepository landlordRepository;

    public List<Landlord> getAllLandlords() {
        return landlordRepository.findAll();
    }

    public Landlord createLandlord(Landlord landlord) {
        return landlordRepository.save(landlord);
    }
}