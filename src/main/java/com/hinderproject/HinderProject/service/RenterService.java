package com.hinderproject.HinderProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hinderproject.HinderProject.repository.LandlordRepository;
import com.hinderproject.HinderProject.model.Landlord;
import java.util.List;

@Service
public class RenterService {

    @Autowired
    private RenterRepository renterRepository;

    public List<Renter> getAllRenters() {
        return renterRepository.findAll();
    }

    public Renter createRenter(Renter renter) {
        return renterRepository.save(renter);
    }
}