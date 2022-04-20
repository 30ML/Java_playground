public class InnerProduct {
  public static void main(String[] args) {
    int[] u = new int[] { 1, 2, 3 };
    int[] v = { 4, 5, 6 };
    int i;
    int innerproduct = 0;

    if (u.length != v.length) {
      System.out.println("두 vector의 크기가 다르므로 연산 불가능");
      System.exit(-1);
    }

    for (i = 0; i < 3; i++) {
      innerproduct = innerproduct + u[i] * v[i];
    }

    System.out.println("innerproduct = " + innerproduct);
  }
}
