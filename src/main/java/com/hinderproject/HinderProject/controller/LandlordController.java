package com.hinderproject.HinderProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.hinderproject.HinderProject.service.LandlordService;
import com.hinderproject.HinderProject.model.Landlord;

import java.util.List;

@RestController
@RequestMapping("/landlords")
public class LandlordController {
    @Autowired
    private LandlordService landlordService;

    @GetMapping
    public List<Landlord> getAllLandlords() {
        return landlordService.getAllLandlords();
    }

    @PostMapping
    public Landlord createLandlord(@RequestBody Landlord landlord) {
        return landlordService.createLandlord(landlord);
    }
}
