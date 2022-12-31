package com.project.attendance.services;

import com.project.attendance.entities.Faclty;

import java.util.List;

public interface FacltyService {

    Faclty create(Faclty faclty);

    List<Faclty> getAllFaclty();

    Faclty getFacltyById(int facltyId);

}
