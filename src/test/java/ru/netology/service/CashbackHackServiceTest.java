package ru.netology.service;

//import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    void ShouldShow400IfAmount1600() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1600;

        int actual = service.remain(amount);
        int expected = 400;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void ShouldShow300IfAmount700() {
        CashbackHackService service = new CashbackHackService();
        int amount = 700;

        int actual = service.remain(amount);
        int expected = 300;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void ShouldShow1IfAmount999() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void ShouldShow999IfAmount1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;

        int actual = service.remain(amount);
        int expected = 999;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void ShouldNotShowRemainIfAmount0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void ShouldNotShowRemainIfAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void ShouldNotShowRemainIfAmountNegative() {
        CashbackHackService service = new CashbackHackService();
        int amount = -10;

        int actual = service.remain(amount);
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }
}