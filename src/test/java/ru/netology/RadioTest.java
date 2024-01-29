package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void SetStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);

        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test() {
        Radio radio = new Radio(20);

        radio.setCurrentStation(15);
        int expected = 15;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    // выбор станции

    // предыдущая станция
    @Test
    public void prevSetStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.prev();

        int expected = 7;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    // предыдущая станция после Min
    @Test
    public void prevSetStationAfterMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    // следующая станция
    @Test
    public void NextSetStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.next();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    // следующая станция после max
    @Test
    public void NextSetStationAfterMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    // выбор станции меньше 0
    @Test
    public void SetStationLessMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    // выбор станции больше 9
    @Test
    public void SetStationMoreMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    // выбор уровня громкости
    @Test
    public void SetoVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);

        int expected = 50;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    // прибавить громкость
    @Test
    public void increaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.volumeUp();

        int expected = 51;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //прибавить громкость больше 100
    @Test
    public void increaseVolumeMoreMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.volumeUp();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    // убавить громкость
    @Test
    public void decreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.volumeDown();

        int expected = 49;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    // убавить меньше 0
    @Test
    public void decreaseVolumeLessMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.volumeDown();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    // выбор громкости больше 100
    @Test
    public void VolumeMoreMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    // установка громкости ниже 0
    @Test
    public void VolumeLessMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}








