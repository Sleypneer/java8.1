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

    @Test
    void firstStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getMaxStation());
        radio.firstStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void secondStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getMaxStation());
        radio.secondStation();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    void thirdStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getMaxStation());
        radio.thirdStation();
        assertEquals(2, radio.getCurrentStation());
    }

    @Test
    void fourthStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getMaxStation());
        radio.fourthStation();
        assertEquals(3, radio.getCurrentStation());
    }

    @Test
    void fifthStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getMaxStation());
        radio.fifthStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    void sixthStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getMaxStation());
        radio.sixthStation();
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    void seventhStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getMaxStation());
        radio.seventhStation();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    void eighthStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getMaxStation());
        radio.eighthStation();
        assertEquals(7, radio.getCurrentStation());
    }

    @Test
    void ninthStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getMaxStation());
        radio.ninthStation();
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    void tenthStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getMaxStation());
        radio.tenthStation();
        assertEquals(9, radio.getCurrentStation());
    }
}