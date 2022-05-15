public class RangeOfVariableUse {
  public static void main(String[] args) {
    int value1 = 3; // 변수 value1 생성 시점
    {
      int value2 = 5; // 변수 value2 생성 시점

      System.out.println(value1);
      System.out.println(value2);
    } // 변수 value2 소멸 시점

    System.out.println(value1);
    // System.out.println(value2); // ERROR: cannot find symbol
  } // 변수 value1 소멸 시점
}
