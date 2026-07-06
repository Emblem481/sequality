package org.example;

public class App {
  public String getGreeting() {
    return "Hello World!";
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());

    Calculate calc = new Calculate();

    int individual1 = calc.getIndividualFee(10);
    int total1 = calc.getTotalFee(10, 1);
    System.out.println("Age 10, Size 1: Individual " + individual1 + ", Total " + total1 + ".");

    int individual2 = calc.getIndividualFee(25);
    int total2 = calc.getTotalFee(25, 1);
    System.out.println("Age 25, Size 1: Individual " + individual2 + ", Total " + total2 + ".");

    int individual3 = calc.getIndividualFee(10);
    int total3 = calc.getTotalFee(10, 15);
    System.out.println("Age 10, Size 15: Individual " + individual3 + ", Total " + total3 + " (Discount applied).");

    int individual4 = calc.getIndividualFee(25);
    int total4 = calc.getTotalFee(25, 15);
    System.out.println("Age 25, Size 15: Individual " + individual4 + ", Total " + total4 + " (Discount applied).");
  }
}
