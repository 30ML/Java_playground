import java.util.*;

public class Exam {
  public static void main(String[] args) {
    int counter = 0;
    StringTokenizer a = new StringTokenizer("/나랏말/싸미/,문자와로/,서로/,사맛디/,아니/할세/,듕귓에/,달아/", ",");
    // StringTokenizer a = new StringTokenizer("I,love", ",");

    while (a.hasMoreTokens()) {
      counter++;
    }
    System.out.println(counter);
  }
}
