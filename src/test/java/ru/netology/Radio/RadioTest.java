package ru.netology.Radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    void ShouldRadio() {
        Radio cond = new Radio();

        cond.setCurrentRadio(7);
        System.out.println(cond.getCurrentRadio());

    }

    @Test
    void Shouldstationmax() {
        Radio cond = new Radio();


        cond.setCurrentRadio(10);

        int expected = 0;
        int actual = cond.getCurrentRadio();

        assertEquals(expected, actual);

    }

    @Test
    void Shouldstationmim() {
        Radio cond = new Radio();


        cond.setCurrentRadio(-1);

        int expected = 9;
        int actual = cond.getCurrentRadio();

        assertEquals(expected, actual);
    }

    @Test
    void ShouldVelome() {
        Radio cond = new Radio();

        cond.setCurrentVolume(7);
        System.out.println(cond.getCurrentVolue());

    }

    @Test
    void Shouldvolumemax() {
        Radio cond = new Radio();


        cond.setCurrentVolume(10);

        int expected = 9;
        int actual = cond.getCurrentVolue();

        assertEquals(expected, actual);

    }

    @Test
    void Shouldvolumemin() {
        Radio cond = new Radio();


        cond.setCurrentVolume(-10);

        int expected = 0;
        int actual = cond.getCurrentVolue();

        assertEquals(expected, actual);
    }
    @Test
     void Shouldvolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(9);

         int expected = 10;
         int actual = cond.getCurrentVolue();

        assertEquals(expected, actual);

    }






}