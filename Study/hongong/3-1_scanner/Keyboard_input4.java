import java.util.Scanner;

class Keyboard_input4 {
  public static void main(String[] args) {
    Scanner ob_sc = new Scanner(System.in);
    String name;
    int age;

    System.out.println("나이와 이름를 입력하세요.");

    age = ob_sc.nextInt();
    ob_sc.nextLine(); // 입력 스트림버퍼를 비우기 위해 추가됨.
    name = ob_sc.nextLine();

    System.out.println(name + "은 멋진 이름입니다.");
    System.out.println(age + "세는 자바를 공부하기 좋은 나이입니다.");
  }
}
