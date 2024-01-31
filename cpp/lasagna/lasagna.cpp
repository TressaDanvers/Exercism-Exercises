constexpr static inline int ovenTime() {
  return 40;
}

constexpr static inline int remainingOvenTime(int actualMinutesInOven) {
  return ovenTime() - actualMinutesInOven;
}

constexpr static inline int preparationTime(int numberOfLayers) {
  return numberOfLayers * 2;
}

constexpr static inline int elapsedTime(int numberOfLayers, int actualMinutesInOven) {
  return actualMinutesInOven + preparationTime(numberOfLayers);
}
