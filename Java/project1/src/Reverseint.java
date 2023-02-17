public class Reverseint {
  public static void main(String[] args) {
    Reverseint obj = new Reverseint();
    obj.reverse(54321);
  }

  void reverse(int a) {
    int b = 0;
    while (a > 0) {
      int d = a % 10;
      b = b * 10 + d;
      a = a / 10;
    }
    System.out.println(b);
  }
}
