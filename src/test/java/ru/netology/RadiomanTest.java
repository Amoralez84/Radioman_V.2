package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadiomanTest {
    Radioman radioman = new Radioman(13);

    @Test
    public void shouldChangeVolume() {

        assertEquals(0, radioman.getCurrentVolume());
        radioman.setCurrentVolume(56);
        assertEquals(56, radioman.getCurrentVolume());
    }

    @Test
    public void shouldChangeUnderMinVolume() {

        assertEquals(0, radioman.getCurrentVolume());
        radioman.setCurrentVolume(0);
        assertEquals(0, radioman.getCurrentVolume());
        radioman.volumeDown();
        assertEquals(0, radioman.getCurrentVolume());
    }

    @Test
    public void shouldChangeUpMaxVolume() {

        assertEquals(0, radioman.getCurrentVolume());
        radioman.setCurrentVolume(100);
        assertEquals(100, radioman.getCurrentVolume());
        radioman.volumeUp();
        assertEquals(100, radioman.getCurrentVolume());
    }

    @Test
    public void shouldChangeChannel() {

        assertEquals(0, radioman.getCurrentChannel());
        radioman.setCurrentChannel(4);
        assertEquals(4, radioman.getCurrentChannel());
    }


    @Test
    public void shouldChangeUpMaxChannel() {

        assertEquals(0, radioman.getCurrentChannel());
        radioman.setCurrentChannel(13);
        assertEquals(13, radioman.getCurrentChannel());
        radioman.channelUp();
        assertEquals(0, radioman.getCurrentChannel());
    }


    @Test
    public void shouldChangeVolumeUp() {

        assertEquals(0, radioman.getCurrentVolume());
        radioman.volumeUp();
        assertEquals(1, radioman.getCurrentVolume());
    }

    @Test
    public void shouldChangeVolumeDown() {

        assertEquals(0, radioman.getCurrentVolume());
        radioman.setCurrentVolume(5);
        assertEquals(5, radioman.getCurrentVolume());
        radioman.volumeDown();
        assertEquals(4, radioman.getCurrentVolume());
    }

    @Test
    public void shouldChangeChannelUp() {

        assertEquals(0, radioman.getCurrentChannel());
        radioman.setCurrentChannel(12);
        assertEquals(12, radioman.getCurrentChannel());
        radioman.channelUp();
        assertEquals(13, radioman.getCurrentChannel());

    }

    @Test
    public void shouldChangeChannelDown() {

        assertEquals(0, radioman.getCurrentChannel());
        radioman.setCurrentChannel(1);
        assertEquals(1, radioman.getCurrentChannel());
        radioman.channelDown();
        assertEquals(0, radioman.getCurrentChannel());
        radioman.channelDown();
        assertEquals(13, radioman.getCurrentChannel());
    }

    @Test
    public void shouldUpMaxChannel() {

        assertEquals(0, radioman.getCurrentChannel());
        radioman.setCurrentChannel(14);
        assertEquals(0, radioman.getCurrentChannel());
    }

    @Test
    public void shouldUpMaxVolume(){
        assertEquals(0, radioman.getCurrentVolume());
        radioman.setCurrentVolume(101);
        assertEquals(0, radioman.getCurrentVolume());
    }
}