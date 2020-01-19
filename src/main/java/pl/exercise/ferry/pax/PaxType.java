package pl.exercise.ferry.pax;

public enum PaxType {
  CHILD(0, 3),
  YOUNG(4, 18),
  ADULT(19, 70),
  SENIOR(71, 200),
  UKNOWN(-100,-50);

  int ageLow;
  int ageHigh;

  PaxType(int ageLow, int ageHigh) {
    this.ageLow = ageLow;
    this.ageHigh = ageHigh;
  }

  public static PaxType fromAge(int age) {
    for (PaxType paxTypes : values()) {
      if (paxTypes.ageLow <= age && paxTypes.ageHigh >= age) {
        return paxTypes;
      }
    }
      return PaxType.UKNOWN;
    }



}


