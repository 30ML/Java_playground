class X {
  X() {
    System.out.println("X의 생성자 실행");
  }
}

class Y extends X {
  Y() {
    System.out.println("Y의 생성자 실행");
  }
}

public class Exam {
  public static void main(String[] args) {
    X ox1 = new X();
    X ox2 = new Y();
    Y oy1 = new X();
    Y oy2 = new Y();
  }
}
