package ru.netology.manager.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {
    @Test
    public void test() {
        Manager afisha = new Manager();
        afisha.addFilm("First1");
        afisha.addFilm("First2");
        afisha.addFilm("First3");

        String[] expected = {"First1", "First2", "First3"};
        String[] actual = afisha.findall();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        Manager afisha = new Manager();
        afisha.addFilm("First1");
        afisha.addFilm("First2");
        afisha.addFilm("First3");
        afisha.addFilm("First4");
        afisha.addFilm("First5");
        String[] expected = {"First1", "First2", "First3", "First4", "First5"};
        String[] actual = afisha.findall();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {
        Manager afisha = new Manager();
        afisha.addFilm("First1");
        afisha.addFilm("First2");
        afisha.addFilm("First3");
        afisha.addFilm("First4");
        afisha.addFilm("First5");
        afisha.addFilm("First6");
        afisha.addFilm("First7");
        afisha.addFilm("First8");
        afisha.addFilm("First9");
        afisha.addFilm("First10");
        String[] expected = {"First1", "First2", "First3", "First4", "First5", "First6", "First7", "First8", "First9", "First10"};
        String[] actual = afisha.findall();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test4() {
        Manager afisha = new Manager();
        afisha.addFilm("First1");
        afisha.addFilm("First2");
        afisha.addFilm("First3");
        afisha.addFilm("First4");
        afisha.addFilm("First5");
        afisha.addFilm("First6");
        afisha.addFilm("First7");
        afisha.addFilm("First8");
        afisha.addFilm("First9");
        afisha.addFilm("First10");
        String[] expected = {"First10", "First9", "First8", "First7", "First6", "First5", "First4", "First3", "First2", "First1"};
        String[] actual = afisha.findlast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test5() {
        Manager afisha = new Manager();
        afisha.addFilm("First1");
        afisha.addFilm("First2");
        afisha.addFilm("First3");
        afisha.addFilm("First4");
        afisha.addFilm("First5");
        afisha.addFilm("First6");
        afisha.addFilm("First7");
        afisha.addFilm("First8");
        afisha.addFilm("First9");
        afisha.addFilm("First10");

        String[] expected = {"First1", "First2", "First3", "First4", "First5", "First6", "First7", "First8", "First9", "First10"};
        String[] actual = afisha.findall();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test6() {
        Manager afisha = new Manager();
        afisha.addFilm("First1");
        afisha.addFilm("First2");
        afisha.addFilm("First3");
        afisha.addFilm("First4");
        afisha.addFilm("First5");
        afisha.addFilm("First6");
        afisha.addFilm("First7");
        afisha.addFilm("First8");
        afisha.addFilm("First9");
        afisha.addFilm("First10");
        afisha.addFilm("First11");
        String[] expected = {"First11", "First10", "First9", "First8", "First7", "First6", "First5", "First4", "First3", "First2"};
        String[] actual = afisha.findlast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test7() {
        Manager afisha = new Manager();
        afisha.addFilm("First1");
        afisha.addFilm("First2");
        afisha.addFilm("First3");
        afisha.addFilm("First4");
        afisha.addFilm("First5");

        String[] expected = {"First5", "First4", "First3", "First2", "First1"};
        String[] actual = afisha.findlast();
        Assertions.assertArrayEquals(expected, actual);
    }

}
