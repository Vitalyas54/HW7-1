package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatisticsServiceTest {
    private StatisticsService service = new StatisticsService();
    private long[] incomes = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};

    @Test
    void findMax() {
        long expected = 12;
        long actual = service.findMax(incomes);
        assertEquals(expected, actual);
    }

  @Test
  void findMin() {
    long expected = 3;
    long actual = service.findMin(incomes);
    assertEquals(expected, actual);


  }
}