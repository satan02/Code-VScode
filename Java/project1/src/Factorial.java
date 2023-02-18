public class Factorial {
  // public int fact(int number) {
  // int num = 1;
  // while (number > 0) {
  // num = num * number;
  // number--;
  // }
  // return num;
  // }

  public int fact(int number) {
    if (number == 0) {
      return 1;
    } else
      return number * (fact(number - 1));
  }

  public static void main(String[] args) {
    Factorial f = new Factorial();
    int factorial = f.fact(5);
    System.out.println(factorial);
  }
}
