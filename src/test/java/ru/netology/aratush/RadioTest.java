package ru.netology.aratush;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void nextStation() {
        Radio radio = new Radio();
        radio.nextStation();
        assertEquals(1, radio.getStation());
        radio.setStation(radio.getStationCount());
        radio.nextStation();
        assertEquals(0, radio.getStation());

    }

    @Test
    void prevStation() {
        Radio radio = new Radio();
        radio.prevStation();
        assertEquals(radio.getStationCount(), radio.getStation());
        radio.setStation((byte) 2);
        radio.prevStation();
        assertEquals(1, radio.getStation());
    }

    @Test
    void increaseVolume() {
        Radio radio = new Radio();
        radio.increaseVolume();
        assertEquals(1, radio.getVolume());
        int i = 0;
        while (i < 100) {
          radio.increaseVolume();
          i++;
        }
        assertEquals(100, radio.getVolume());
    }

    @Test
    void decreaseVolume() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        assertEquals(radio.getVolume(), 0);
        radio.increaseVolume();
        radio.decreaseVolume();
        assertEquals(radio.getVolume(), 0);
    }

    @Test
    void getStation() {
        Radio radio = new Radio();
        assertEquals(radio.getStation(), 0);
    }

    @Test
    void setStation() {
        Radio radio = new Radio();
        radio.setStation((byte) 5);
        assertEquals(radio.getStation(), 5);
        radio.setStation((byte) -1);
        assertEquals(radio.getStation(), 5);
        radio.setStation((byte)( radio.getStationCount() + 1));
        assertEquals(radio.getStation(), 5);
        radio.setStation((byte) 0);
        assertEquals(radio.getStation(), 0);
        radio.setStation((byte) 9);
        assertEquals(radio.getStation(), 9);
    }

    @Test
    void getVolume() {
        Radio radio = new Radio();
        assertEquals(radio.getVolume(),0);
    }
}