package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class parkingPlaceTest {

    @BeforeEach
    void setUp() {
        parkingPlace p = new parkingPlace();
    }



    @Test
    void calcTime() {
        assertEquals(500 , calcTime(520));

    }

    @Test
    void calcPreis() {
    }
}