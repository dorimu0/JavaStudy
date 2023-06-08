package generic;

public class GenericPair<T, V> {
  V key;
  T value;

  public GenericPair(V key, T value) {
    this.value = value;
    this.key = key;
  }

  public T getValue() {
    return value;
  }
  public V getKey() {
    return key;
  }
}
