package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class RadioTest {
    @Test
    void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(3);
        radio.increaseVolume();

        int expected = 4;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(7);
        radio.decreaseVolume();

        int expected = 6;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldMaxVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldMinVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(110);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldVolumeBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-2);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseChannelNum() {
        Radio radio = new Radio();

        radio.setCurrentChannelNumber(7);
        radio.increaseChannelNumber();

        int expected = 8;
        int actual = radio.getCurrentChannelNumber();

        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseChannelNum() {
        Radio radio = new Radio();

        radio.setCurrentChannelNumber(2);
        radio.decreaseChannelNumber();

        int expected = 1;
        int actual = radio.getCurrentChannelNumber();

        assertEquals(expected, actual);
    }

    @Test
    void shouldMaxChannelNum() {
        Radio radio = new Radio();

        radio.setCurrentChannelNumber(9);
        radio.increaseChannelNumber();

        int expected = 0;
        int actual = radio.getCurrentChannelNumber();

        assertEquals(expected, actual);
    }

    @Test
    void shouldMinChannelNum() {
        Radio radio = new Radio();

        radio.setCurrentChannelNumber(0);
        radio.decreaseChannelNumber();

        int expected = 9;
        int actual = radio.getCurrentChannelNumber();

        assertEquals(expected, actual);
    }

    @Test
    void shouldChannelNumAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentChannelNumber(13);

        int expected = 0;
        int actual = radio.getCurrentChannelNumber();

        assertEquals(expected, actual);
    }

    @Test
    void shouldChannelNumBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentChannelNumber(-7);

        int expected = 0;
        int actual = radio.getCurrentChannelNumber();

        assertEquals(expected, actual);
    }


    @Test
    void shouldDefaultChannelAboveMax() {
        Radio radio = new Radio(20);

        radio.setCurrentChannelNumber(20);
        int expected = 0;
        int actual = radio.getCurrentChannelNumber();

        assertEquals(expected, actual);

    }
}
