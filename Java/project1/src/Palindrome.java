public class Palindrome {
  public void reverse(int number) {
    int temp = 0, rev = 0;
    while (number > 0) {
      temp = number % 10;
      rev = rev * 10 + temp;
      number /= 10;
    }
    System.out.println(rev);
  }

  public void reverse(String text) {
    String[] arr = text.split("");
    String rev = new String();
    for (int i = 0; i < arr.length; i++) {
      rev = arr[i] + rev;
    }
    System.out.println(rev);
  }

  public static void main(String[] args) {
    Palindrome p = new Palindrome();
    p.reverse(12345);
    p.reverse("hello dhamma");
  }
}
