package ru.netology;

public class Radio {
    private int currentVolume; // текущая громкость
    private int currentStation; // текущая станция
    private int maxStation = 9;
    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio(int stationsCount) {
        this.maxStation = stationsCount - 1;
    }

    public Radio() {

    }


    // public int getMinStation() {
    //    return minStation;
    //}
    //public int getMaxStation() {
    //    return maxStation;
    //}
    //public int getMaxVolume() {
    //     return maxVolume;
    //}
    //public int getMinVolume() {
    //   return minVolume;
    //}

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void volumeUp() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void volumeDown() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void next() {
        if (currentStation != maxStation) {
            currentStation++;
            return;
        }
        currentStation = minStation;
    }

    public void prev() {
        if (currentStation != minStation) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }
}


