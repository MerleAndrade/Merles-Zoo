package com.example.merleszoo.zoo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TruckRepository {

    private final List<Truck> trucks = new ArrayList<>(

            List.of(
                    new Truck("Phillips Currywurst"),
                    new Truck("Felipes Arepas"),
                    new Truck("Klaras gesunde Küche")
            ));


    public List<Truck> getAllTrucks() {
        return trucks;
    }
}
