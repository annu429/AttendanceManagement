package com.project.attendance.services.impl;

import com.project.attendance.entities.Faclty;
import com.project.attendance.exception.ResourceNotFoundException;
import com.project.attendance.repositiries.FacltyRepository;
import com.project.attendance.services.FacltyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacltyServiceImpl implements FacltyService {

    @Autowired
    private FacltyRepository facltyRepository;

    @Override
    public Faclty create(Faclty faclty) {
        return facltyRepository.save(faclty);
    }

    @Override
    public List<Faclty> getAllFaclty() {
        return facltyRepository.findAll();
    }

    @Override
    public Faclty getFacltyById(int facltyId) {
        return facltyRepository.findById(facltyId).orElseThrow(() -> new ResourceNotFoundException("Faculty is id not found"));
    }
}
