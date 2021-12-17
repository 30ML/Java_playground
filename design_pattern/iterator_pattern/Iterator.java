package iterator_pattern;

public interface Iterator {
  public abstract boolean hasNext(); // 다음 요소가 존재하는지 확인하는 메서드

  public abstract Object next(); // 다음 요소를 얻기 위한 메서드
}
