package org.example;

public class Radio {

    private int currentVolume;
    private int currentRadioStationNumber;

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

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume >= 0 && currentVolume <= 100) {
            this.currentVolume = currentVolume;
        } else {
            System.out.println("Недопустимое значение громкости");
        }
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
        } else {
            currentRadioStationNumber = 0;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStationNumber > 0) {
            currentRadioStationNumber = currentRadioStationNumber - 1;
        } else {
            currentRadioStationNumber = 9;
        }
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

}

