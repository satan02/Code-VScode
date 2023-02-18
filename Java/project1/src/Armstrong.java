public class Armstrong {
  public boolean isarmstrong(int number) {
    int digit = 0, sum = 1, total = 0, temp = number, lastdigit;
    while (temp > 0) {
      int mod = temp % 10;
      digit++;
      temp /= 10;
    }
    temp = number;
    while (temp > 0) {
      lastdigit = temp % 10;
      sum = power(lastdigit, digit);
      total = total + sum;
      temp /= 10;
    }

    System.out.println(total);
    System.out.println(number);
    if (number == total)
      return true;
    else
      return false;
  }

  int power(int number, int pow) {
    int sum = 1;
    for (int i = 0; i < pow; i++) {
      sum = sum * number;
    }
    return sum;
  }

  public static void main(String[] args) {
    Armstrong as = new Armstrong();
    boolean check = as.isarmstrong(153);
    System.out.println(check);
  }
}
