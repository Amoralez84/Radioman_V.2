package ru.netology;

public class Radioman {
    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentVolume;
    private int minChannel = 0;
    private int maxChannel = 9;
    private int currentChannel;

    public void volumeUp() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
        if (currentVolume == maxVolume) {
            return;
        }
    }

    public void volumeDown() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
        if (currentVolume == minVolume) {
            return;
        }
    }

    public void channelUp() {
        if (currentChannel < maxChannel) {
            currentChannel++;
            return;
        }
        currentChannel = minChannel;

    }

    public void channelDown() {
        if (currentChannel > minChannel) {
            currentChannel--;
            return;
        }
        currentChannel = maxChannel;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int setCurrentVolume(int currentVolume) {
        if (currentVolume == maxVolume) {
            currentVolume = maxVolume;
        }
        if (currentVolume == minVolume) {
            return minVolume;
        }
        this.currentVolume = currentVolume;
        return currentVolume;
    }

    public int getMinChannel() {
        return minChannel;
    }

    public void setMinChannel(int minChannel) {
        this.minChannel = minChannel;
    }

    public int getMaxChannel() {
        return maxChannel;
    }

    public void setMaxChannel(int maxChannel) {
        this.maxChannel = maxChannel;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel > maxChannel) {
            return;
        }
        this.currentChannel = currentChannel;
    }

}


