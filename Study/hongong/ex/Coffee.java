public class Coffee {
  void print1() {
    System.out.println("Jamaica");
  }

  static void print2() {
    System.out.println("Vietnam");
  }

  public static void main(String[] args) {
    Coffee ob = new Coffee();
    ob.print1();
    ob.print2();

    print1();
    print2();
  }
}
