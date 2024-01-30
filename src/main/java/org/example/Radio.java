package org.example;

public class Radio {

    private int currentVolume;
    private int currentRadioStationNumber;
    private int maxRadioStationNumber;

    public Radio(int maxRadioStationNumber) {
        this.maxRadioStationNumber = maxRadioStationNumber;
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

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume >= 0 && currentVolume <= 100) {
            this.currentVolume = currentVolume;
        } else {
            System.out.println("Недопустимое значение громкости");
        }
    }

    public void setCurrentRadioStationNumber(int currentRadioStationNumber) {
        if (currentRadioStationNumber >= 0 && currentRadioStationNumber < maxRadioStationNumber) {
            this.currentRadioStationNumber = currentRadioStationNumber;
        } else if (currentRadioStationNumber == maxRadioStationNumber) {
            this.currentRadioStationNumber = 0;
        } else {
            System.out.println("Недопустимое значение номера радиостанции");
        }
    }

    public void nextRadioStation() {
        if (currentRadioStationNumber < maxRadioStationNumber - 1) {
            currentRadioStationNumber = currentRadioStationNumber + 1;
        } else {
            currentRadioStationNumber = 0;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStationNumber > 0) {
            currentRadioStationNumber = currentRadioStationNumber - 1;
        } else {
            currentRadioStationNumber = maxRadioStationNumber - 1;
        }
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

}