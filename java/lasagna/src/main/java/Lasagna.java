public class Lasagna {
  public int expectedMinutesInOven() { return 40; }
  public int preparationTimeInMinutes(int layers) { return 2 * layers; }

  public int remainingMinutesInOven(int timeSpentCooking) {
    return expectedMinutesInOven() - timeSpentCooking;
  }

  public int totalTimeInMinutes(int layers, int timeSpentCooking) {
    return timeSpentCooking + preparationTimeInMinutes(layers);
  }
}
