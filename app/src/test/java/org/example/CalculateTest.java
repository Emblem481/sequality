package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {

  @Test
  public void testSum() {
    Calculate calc = new Calculate();
    assertEquals(5, calc.sum(2, 3));
  }

  @Test
  public void testGetIndividualFee() {
    Calculate calc = new Calculate();

    assertEquals(1000, calc.getIndividualFee(12));

    assertEquals(2000, calc.getIndividualFee(13));
  }

  @Test
  public void testGetTotalFee() {
    Calculate calc = new Calculate();

    assertEquals(1000, calc.getTotalFee(10, 1));

    assertEquals(2000, calc.getTotalFee(25, 1));

    assertEquals(13500, calc.getTotalFee(10, 15));

    assertEquals(27000, calc.getTotalFee(25, 15));
  }
}
