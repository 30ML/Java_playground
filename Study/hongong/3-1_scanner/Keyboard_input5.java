import java.io.InputStreamReader;
import java.io.*;
import java.util.*;

class Keyboard_input5 {
  public static void main(String[] args) throws IOException { // 예외 처리
    /* 두 줄로 사용도 가능 */
    // InputStreamReader isr = new InputStreamReader(System.in); // 문자 단위로 입력
    // BufferedReader in = new BufferedREader(isr); // readLine() 메소드가 지원됨.

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    String name;
    int age;

    System.out.println("나이와 이름를 입력하세요.");

    age = Integer.parseInt(in.readLine()); // 문자열을 정수로 변환
    name = in.readLine(); // 엔터키를 기준으로 줄단위 입력

    System.out.println(name + "은 멋진 이름입니다.");
    System.out.println(age + "세는 자바를 공부하기 좋은 나이입니다.");
  }
}
