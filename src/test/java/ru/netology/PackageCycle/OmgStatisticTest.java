package ru.netology.PackageCycle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OmgStatisticTest {

    @Test // полное имя импортировано наверх
    void totalSum() { // автоматом подтянулось при создании теста
        OmgStatisticService bolshePeremennyh = new OmgStatisticService(); // инициализация нового

        long[] massive = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}; // набор данных для теста суммирования
        long expected = 180; // ожидаемый результат суммирования

        long actual = bolshePeremennyh.totalSum(massive);

        assertEquals(expected, actual);
    }

    @Test // про среднее
    void medium() { // автоматом подтянулось при создании теста
        OmgStatisticService bolshePeremennyh2 = new OmgStatisticService(); // инициализация нового

        long[] massive = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}; // набор данных для суммирования
        long expected = 15; // ожидаемый результат деления суммы на количество в массиве

        long actual = bolshePeremennyh2.medium(massive);

        assertEquals(expected, actual);
    }

    @Test // про максимум
    void lastMax() { // автоматом подтянулось при создании теста
        OmgStatisticService bolshePeremennyh3 = new OmgStatisticService(); // инициализация нового

        long[] massive = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}; // набор данных для суммирования
        long expected = 7; // ожидаемый результат - номер последнего месяца с максимумом

        long actual = bolshePeremennyh3.numberOfLastMax(massive);

        assertEquals(expected, actual);
    }


    @Test // про минимум
    void lastMin() { // автоматом подтянулось при создании теста
        OmgStatisticService bolshePeremennyh4 = new OmgStatisticService(); // инициализация нового

        long[] massive = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}; // набор данных для суммирования
        long expected = 8; // ожидаемый результат - номер последнего месяца с минимумом

        long actual = bolshePeremennyh4.numberOfLastMin(massive);

        assertEquals(expected, actual);
    }

    @Test // про упадочные месяцы
    void lessThenMedium() { // автоматом подтянулось при создании теста
        OmgStatisticService bolshePeremennyh5 = new OmgStatisticService(); // инициализация нового

        long[] massive = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}; // набор данных для суммирования
        long expected = 5; // ожидаемый результат - число дохлых месяцев

        long actual = bolshePeremennyh5.lessThenMedium(massive);

        assertEquals(expected, actual);
    }

    @Test // про упадочные месяцы (full версия)
    void lessThenMedium2() { // автоматом подтянулось при создании теста
        OmgStatisticService bolshePeremennyh6 = new OmgStatisticService(); // инициализация нового

        long[] massive = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}; // набор данных для суммирования
        long expected = 5; // ожидаемый результат - число дохлых месяцев

        long actual = bolshePeremennyh6.lessThenMediumFull(massive);

        assertEquals(expected, actual);
    }

    @Test // про прибыточные месяцы
    void moreThenMedium(){
        OmgStatisticService bolshePeremennyh7 = new OmgStatisticService();

        long[] massive = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}; // набор данных для суммирования
        long expected = 5; // число прибыльных месяцев

        long actual = bolshePeremennyh7.moreThenMedium(massive);

        assertEquals(expected, actual);
    }



} // закрыли все тесты