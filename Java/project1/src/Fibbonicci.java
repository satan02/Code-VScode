public class Fibbonicci {
  public int[] fibb(int a, int b) {
    if (a < 0 && b < a) {
      return null;
    }

    int[] arr = new int[(b - a) + 1];
    int j = 0, sum = 0;
    for (int i = a; i <= b; i++) {
      sum = sum + i;
      arr[j] = sum;
      j++;
    }
    return arr;
  }

  public static void main(String[] args) {
    Fibbonicci fib = new Fibbonicci();
    int[] arr2 = fib.fibb(10, 25);
    for (int i = 0; i < arr2.length; i++) {
      System.out.println(arr2[i]);
    }
  }
}
