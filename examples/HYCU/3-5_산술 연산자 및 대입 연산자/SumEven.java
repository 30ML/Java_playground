public class SumEven {
  public static void main(String[] args) {
    int sum = 0;
    int count;

    for (count = 2; count <= 10; count += 2) {
      sum += count;
    }

    System.out.println("1~10 중 짝수의 합은 " + sum);
  }
}
