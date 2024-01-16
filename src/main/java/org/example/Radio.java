package org.example;

public class Radio {

    public int currentVolume;
    public int currentRadioStationNumber;

    public Radio(int currentRadioStationNumber, int currentVolume) {
        this.currentRadioStationNumber = currentRadioStationNumber;
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadioStationNumber(int currentRadioStationNumber) {
        if (currentRadioStationNumber >= 0 && currentRadioStationNumber <= 9) {
            this.currentRadioStationNumber = currentRadioStationNumber;
        } else if (currentRadioStationNumber > 9) {
            this.currentRadioStationNumber = 0;
        } else {
            this.currentRadioStationNumber = 9;
        }
    }

    public void nextRadioStation() {
        if (currentRadioStationNumber < 9) {
            currentRadioStationNumber = currentRadioStationNumber + 1;
        } else if (currentRadioStationNumber == 9) {
            currentRadioStationNumber = 0;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStationNumber > 0) {
            currentRadioStationNumber = currentRadioStationNumber - 1;
        } else if (currentRadioStationNumber == 0) {
            currentRadioStationNumber = 9;
        }
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

}

