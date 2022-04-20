public class ex01 {
  public static void main(String[] args) {
    Sub sub = new Sub();
    sub.printmsg();
  }
}

class Super {
  void printmsg() {
    System.out.println("상위 클래스입니다.");
  }
}

class Sub extends Super {
  void printmsg() {
    super.printmsg();
    System.out.println("서브 클래스입니다.");
  }
}
