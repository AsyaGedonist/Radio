package SmartHouse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldCreate() {
        Radio radio = new Radio();

        radio.setCurrentChanel(5);

        int expected = 5;
        int actual = radio.getCurrentChanel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);
        radio.quiet();

        int expected = 4;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldNotDecreaseVolumeLessBottomLine() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);
        radio.quiet();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolumeBottomLine() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.quiet();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeBottomLine() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);
        radio.quiet();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeUpperLine() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);
        radio.louder();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolumeUpperLine() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.louder();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolumeMoreUpperLine() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);
        radio.louder();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetChanel() {
        Radio radio = new Radio();

        radio.setCurrentChanel(5);

        int expected = 5;
        int actual = radio.getCurrentChanel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetChanelBottomLine() {
        Radio radio = new Radio();

        radio.setCurrentChanel(-1);

        int expected = 0;
        int actual = radio.getCurrentChanel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetChanelBottomLine() {
        Radio radio = new Radio();

        radio.setCurrentChanel(0);

        int expected = 0;
        int actual = radio.getCurrentChanel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetChanelMoreBottomLine() {
        Radio radio = new Radio();

        radio.setCurrentChanel(1);

        int expected = 1;
        int actual = radio.getCurrentChanel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetChanelLessUpperLine() {
        Radio radio = new Radio();

        radio.setCurrentChanel(8);

        int expected = 8;
        int actual = radio.getCurrentChanel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetChanelUpperLine() {
        Radio radio = new Radio();

        radio.setCurrentChanel(9);

        int expected = 9;
        int actual = radio.getCurrentChanel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetChanelUpperLine() {
        Radio radio = new Radio();

        radio.setCurrentChanel(10);

        int expected = 0;
        int actual = radio.getCurrentChanel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void simpleIncreaseChanel() {
        Radio radio = new Radio();

        radio.setCurrentChanel(6);
        radio.next();

        int expected = 7;
        int actual = radio.getCurrentChanel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ComplicatedIncreaseChanel() {
        Radio radio = new Radio();

        radio.setCurrentChanel(9);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentChanel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void simpleDecreaseChanel() {
        Radio radio = new Radio();

        radio.setCurrentChanel(6);
        radio.prev();

        int expected = 5;
        int actual = radio.getCurrentChanel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ComplicatedDecreaseChanel() {
        Radio radio = new Radio();

        radio.setCurrentChanel(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentChanel();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void ComplicatedDecreaseChanelFifteenChannels() {
        Radio radio = new Radio(1, 1, 15, 100);

        radio.setCurrentChanel(0);
        radio.prev();

        int expected = 14;
        int actual = radio.getCurrentChanel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ComplicatedIncreaseChanelFifteenChannels() {
        Radio radio = new Radio(1, 1, 15, 100);

        radio.setCurrentChanel(14);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentChanel();
        Assertions.assertEquals(expected, actual);
    }
}
