public class PrePost {
  public static void main(String[] args) {
    int x = 1, a = 2;

    System.out.print("x = " + x + ", a = " + a + " -> ");
    x = ++a;
    System.out.println("x = ++a -> x = " + x + ", a = " + a); // 3 3

    x = 1;
    a = 2;
    System.out.print("x = " + x + ", a = " + a + " -> ");
    x = a++;
    System.out.println("x = a++ -> x = " + x + ", a = " + a); // 2 3

    x = 1;
    a = 2;
    System.out.print("x = " + x + ", a = " + a + " -> ");
    x = a--;
    System.out.println("x = a-- -> x = " + x + ", a = " + a); // 2 1

    x = 1;
    a = 2;
    System.out.print("x = " + x + ", a = " + a + " -> ");
    x = --a;
    System.out.println("x = --a -> x = " + x + ", a = " + a); // 1 1
  }
}
