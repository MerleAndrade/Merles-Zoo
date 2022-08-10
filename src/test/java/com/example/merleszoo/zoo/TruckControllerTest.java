package com.example.merleszoo.zoo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class TruckControllerTest {

    private final TruckService truckService = mock(TruckService.class);

    private final TruckController truckController = new TruckController(truckService);

    private final List<Truck> testList = List.of(
            new Truck("Hähnchen"),
            new Truck("Döner"),
            new Truck("Pommes"));

    @Test
    void getAllTrucks() {
        //given
        when(truckService.getAllTrucks()).thenReturn(testList);
        //when
        List<Truck> actual = truckController.getAllTrucks();
        //then
        Assertions.assertArrayEquals(testList.toArray(), actual.toArray());
    }
}