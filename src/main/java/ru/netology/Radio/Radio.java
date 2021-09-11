package ru.netology.Radio;

public class Radio {
    private int currentRadio;
    private int currentVolume;

    public int getCurrentRadio() {
        return currentRadio;
    }

    public int getCurrentVolue() {
        return currentVolume;
    }

    public void setCurrentRadio(int newRadio) {
        int minRadio = 0;
        int maxRadio = 9;
        if (newRadio < minRadio) {
            return;
        }
        if (newRadio > maxRadio) {
            return;
        }
        currentRadio = newRadio;

    }

    public void setstationmax(int stationmax) {
        int minRadio = 0;
        int maxRadio = 9;

        if (currentRadio > maxRadio) {
            currentRadio = minRadio;
        } else {
           currentRadio = currentRadio;
        }
        currentRadio = stationmax;


    }

    public void setstationmin(int stationmin) {
        int minRadio = 0;
        int maxRadio = 9;

        if (currentRadio < minRadio) {
            currentRadio = maxRadio;
        } else {
            currentRadio = currentRadio;
        }
        currentRadio = stationmin;

    }

    public void setCurrentVolume(int newVolue) {
        int minVolume = 0;
        int maxVolume = 9;
        if (newVolue < minVolume) {
            return;
        }
        if (newVolue > maxVolume) {
            return;
        }
        currentRadio = newVolue;

    }

    public void setvoluemax(int voluemax) {
        int minVolue = 0;
        int maxVolue = 9;

        if (currentVolume > maxVolue) {
            currentRadio = maxVolue;
        } else {
            currentVolume = currentVolume;
        }
        // currentVolume = voluemax;

    }

    public void setvoluemin(int voluemin) {
        int minVolue = 0;
        int maxMaxVolue = 9;

        if (currentRadio < minVolue) {
            currentRadio = minVolue;
        } else {
            currentVolume = currentVolume;
        }
        currentRadio = voluemin;

    }
    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }

        }
    }







