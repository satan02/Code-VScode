public class Power {
  int power(int number, int pow) {
    int sum = 1;
    for (int i = 0; i < pow; i++) {
      sum = sum * number;
    }
    return sum;
  }

  public static void main(String[] args) {
    Power p = new Power();
    System.out.println(p.power(5, 4));
  }
}
