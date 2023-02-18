public class Primenumber {
  public boolean isprime(int number) {
    if (number > 0 & number % 2 == 0)
      return true;
    else
      return false;
  }

  public static void main(String[] args) {
    Primenumber p = new Primenumber();
    boolean prime = p.isprime(135);
    System.out.println(prime);
  }
}
