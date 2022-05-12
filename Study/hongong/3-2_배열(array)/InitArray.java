public class InitArray {
  public static void main(String[] args) {
    int i;
    int[] a = new int[] { 1, 2, 3, 4 };
    int[] b = { 1, 2, 3, 4 };
    int[] c;
    c = new int[] { 1, 2, 3, 4 }; // c = { 1, 2, 3, 4 } 와 같이 직접 대입 안됨.

    int d[] = new int[] { 1, 2, 3, 4 };
    int e[] = { 1, 2, 3, 4 };
    int f[];
    f = new int[] { 1, 2, 3, 4 }; // f = { 1, 2, 3, 4 } 와 같이 직접 대입 안됨.

    for (i = 0; i < 4; i++) {
      System.out.print(a[i]);
      System.out.print(b[i]);
      System.out.print(c[i]);
      System.out.print(d[i]);
      System.out.print(e[i]);
      System.out.print(f[i]);
      System.out.println();
    }
  }
}
