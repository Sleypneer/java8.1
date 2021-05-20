package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    void increaseCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getMaxStation());
        radio.increaseCurrentStation();
        assertEquals(radio.getMinStation(), radio.getCurrentStation());
    }

    @Test
    void decreaseCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getMinStation());
        radio.decreaseCurrentStation();
        assertEquals(radio.getMaxStation(), radio.getCurrentStation());
    }

    @Test
    void increaseCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(radio.getMaxVolume());
        radio.increaseCurrentVolume();
        assertEquals(radio.getMaxVolume(), radio.getCurrentVolume());
    }

    @Test
    void decreaseCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(radio.getMinVolume());
        radio.decreaseCurrentVolume();
        assertEquals(radio.getMinVolume(), radio.getCurrentVolume());
    }


}