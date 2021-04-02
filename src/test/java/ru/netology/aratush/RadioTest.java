package ru.netology.aratush;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void nextStation() {
        Radio radio = new Radio();
        radio.nextStation();
        assertEquals(radio.getStation(), 1);
        radio.setStation((byte) 9);
        radio.nextStation();
        assertEquals(radio.getStation(), 0);

    }

    @Test
    void prevStation() {
        Radio radio = new Radio();
        radio.prevStation();
        assertEquals(radio.getStation(), 9);
        radio.setStation((byte) 2);
        radio.prevStation();
        assertEquals(radio.getStation(), 1);
    }

    @Test
    void increaseVolume() {
        Radio radio = new Radio();
        radio.increaseVolume();
        assertEquals(radio.getVolume(), 1);
        int i = 0;
        while (i < 10) {
          radio.increaseVolume();
          i++;
        }
        assertEquals(radio.getVolume(), 10);
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
        radio.setStation((byte) 10);
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