package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void ShouldShow400IfAmount1600() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1600;

        int actual = service.remain(amount);
        int expected = 400;

        assertEquals(actual, expected);
    }

    @Test
    public void ShouldShow300IfAmount700() {
        CashbackHackService service = new CashbackHackService();
        int amount = 700;

        int actual = service.remain(amount);
        int expected = 300;

        assertEquals(actual, expected);
    }

    @Test
    public void ShouldShow1IfAmount999() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    public void ShouldShow999IfAmount1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }

    @Test
    public void ShouldNotShowRemainIfAmount0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void ShouldNotShowRemainIfAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void ShouldNotShowRemainIfAmountNegative() {
        CashbackHackService service = new CashbackHackService();
        int amount = -10;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }
}