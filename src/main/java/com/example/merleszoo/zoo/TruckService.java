package com.example.merleszoo.zoo;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TruckService {

    private final TruckRepository truckRepository;

    public TruckService(TruckRepository truckRepository) {
        this.truckRepository = truckRepository;
    }


    public List<Truck> getAllTrucks() {
        return truckRepository.getAllTrucks();
    }

}
