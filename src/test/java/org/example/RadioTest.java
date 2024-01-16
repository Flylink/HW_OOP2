package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void checkIncreaseVolume() {
        Radio radio = new Radio(0, 50);
        int expected = 51;
        radio.increaseVolume();
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void checkDecreaseVolume() {
        Radio radio = new Radio(0, 50);
        int expected = 49;
        radio.decreaseVolume();
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void checkSetCurrentRadioStationNumber() {
        Radio radio = new Radio(0, 50);
        int expected = 5;
        radio.setCurrentRadioStationNumber(5);
        Assertions.assertEquals(expected, radio.getCurrentRadioStationNumber());
    }

    @Test
    public void checkSetCurrentRadioStationNumberOutsideAbove() {
        Radio radio = new Radio(9, 50);
        int expected = 0;
        radio.setCurrentRadioStationNumber(10);
        Assertions.assertEquals(expected, radio.getCurrentRadioStationNumber());
    }

    @Test
    public void checkSetCurrentRadioStationNumberOutsideBelow() {
        Radio radio = new Radio(9, 50);
        int expected = 9;
        radio.setCurrentRadioStationNumber(-1);
        Assertions.assertEquals(expected, radio.getCurrentRadioStationNumber());
    }


    @Test
    public void checkNextRadioStation() {
        Radio radio = new Radio(8, 50);
        radio.nextRadioStation();
        Assertions.assertEquals(9, radio.getCurrentRadioStationNumber());
        radio.nextRadioStation();
        Assertions.assertEquals(0, radio.getCurrentRadioStationNumber());
    }

    @Test
    public void checkPrevRadioStation() {
        Radio radio = new Radio(1, 50);
        radio.prevRadioStation();
        Assertions.assertEquals(0, radio.getCurrentRadioStationNumber());
        radio.prevRadioStation();
        Assertions.assertEquals(9, radio.getCurrentRadioStationNumber());
    }
}
