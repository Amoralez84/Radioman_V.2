package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadiomanTest {
    Radioman radioman = new Radioman();
    @Test
    public void shouldChangeVolume() {

        assertEquals(0, radioman.getCurrentVolume());
        radioman.setCurrentVolume(7);
        assertEquals(7, radioman.getCurrentVolume());
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
        radioman.setCurrentVolume(10);
        assertEquals(10, radioman.getCurrentVolume());
        radioman.volumeUp();
        assertEquals(10, radioman.getCurrentVolume());
    }

    @Test
    public void shouldChangeChannel() {

        assertEquals(0, radioman.getCurrentChannel());
        radioman.setCurrentChannel(4);
        assertEquals(4, radioman.getCurrentChannel());
    }

    @Test
    public void shouldChangeUnderMinChannel() {

        assertEquals(0, radioman.getCurrentChannel());
        radioman.setMinChannel(0);
        assertEquals(0, radioman.getMinChannel());
        radioman.channelDown();
        assertEquals(9, radioman.getCurrentChannel());

    }

    @Test
    public void shouldChangeUpMaxChannel() {

        assertEquals(0, radioman.getCurrentChannel());
        radioman.setCurrentChannel(9);
        assertEquals(9, radioman.getCurrentChannel());
        radioman.channelUp();
        assertEquals(0, radioman.getCurrentChannel());
    }

    @Test
    public void shouldChangeMaxVolume() {

        assertEquals(0, radioman.getCurrentVolume());
        radioman.setMaxVolume(10);
        assertEquals(10, radioman.getMaxVolume());
    }

    @Test
    public void shouldChangeMinVolume() {

        assertEquals(0, radioman.getCurrentVolume());
        radioman.setCurrentVolume(6);
        assertEquals(6, radioman.getCurrentVolume());
        radioman.setMinVolume(0);
        assertEquals(0, radioman.getMinVolume());
    }

    @Test
    public void shouldChangeMaxChannel() {

        assertEquals(0, radioman.getCurrentChannel());
        radioman.setMaxChannel(9);
        assertEquals(9, radioman.getMaxChannel());
    }

    @Test
    public void shouldChangeMinChannel() {

        assertEquals(0, radioman.getCurrentChannel());
        radioman.setCurrentChannel(4);
        assertEquals(4, radioman.getCurrentChannel());
        radioman.setMinChannel(0);
        assertEquals(0, radioman.getMinChannel());
    }

    @Test
    public void shouldChangeVolumeUp() {

        assertEquals(0, radioman.getMinVolume());
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
        radioman.setCurrentChannel(8);
        assertEquals(8, radioman.getCurrentChannel());
        radioman.channelUp();
        assertEquals(9, radioman.getCurrentChannel());
        radioman.setCurrentChannel(9);

    }

    @Test
    public void shouldChangeChannelDown() {

        assertEquals(0, radioman.getCurrentChannel());
        radioman.setCurrentChannel(1);
        assertEquals(1, radioman.getCurrentChannel());
        radioman.channelDown();
        assertEquals(0, radioman.getCurrentChannel());
    }

    @Test
    public void shouldUpMaxChannel() {

        assertEquals(0, radioman.getCurrentChannel());
        radioman.setCurrentChannel(10);
        assertEquals(0, radioman.getCurrentChannel());

    }

}